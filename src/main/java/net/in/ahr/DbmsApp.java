package net.in.ahr;

import net.in.ahr.dbmsOnline.api.strage.database.ReceiveJsonAndInsert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by str2653z on 2016/05/03.
 */
@SpringBootApplication
@EnableOAuth2Sso
public class DbmsApp extends WebSecurityConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(DbmsApp.class, args);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.csrf().disable() // CSRF対策を無効化
				.authorizeRequests()
				.antMatchers("/", "/api/**").permitAll()
				.anyRequest().authenticated()
				.and().logout().logoutSuccessUrl("/").permitAll();;
	}

}
