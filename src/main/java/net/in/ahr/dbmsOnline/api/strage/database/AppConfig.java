package net.in.ahr.dbmsOnline.api.strage.database;

import net.sf.log4jdbc.Log4jdbcProxyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @SuppressWarnings("SpringJavaAutowiringInspection") // TODO: このアノテーションがないとエラーが出るが出てても正常動作する件
    @Autowired
    DataSourceProperties dataSourceProperties;
    DataSource dataSource;

    @ConfigurationProperties(prefix = DataSourceProperties.PREFIX)
    @Bean(destroyMethod = "close")
    DataSource realDataSource() {
        DataSourceBuilder factory = DataSourceBuilder
                .create(this.dataSourceProperties.getClassLoader())
                .url(this.dataSourceProperties.getUrl())
                .username(this.dataSourceProperties.getUsername())
                .password(this.dataSourceProperties.getPassword());
        this.dataSource = factory.build();
        return this.dataSource;
    }

    @Primary
    @Bean
    DataSource dataSource() {
        // Domaの返却するDataSourceはそのままだとSpringの管理外になるため、
        // 実行時例外発生時にロールバックされなくなる。
        // TransactionAwareDataSourceProxyで包むように修正。
        // http://qiita.com/nyasba/items/1e22c2401f3849f9071d
        return new TransactionAwareDataSourceProxy(
                new Log4jdbcProxyDataSource(this.dataSource)
        );
    }

}
