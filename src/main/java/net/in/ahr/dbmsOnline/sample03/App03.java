package net.in.ahr.dbmsOnline.sample03;

import net.in.ahr.dbmsOnline.sample03.domain.Customer;
import net.in.ahr.dbmsOnline.sample03.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

@EnableAutoConfiguration
@ComponentScan
public class App03 implements CommandLineRunner {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

//    @Autowired
//    CustomerService customerService;

    @Override
    public void run(String... strings) throws Exception {

        String sql = "SELECT 1";
        SqlParameterSource param = new MapSqlParameterSource();
        Integer result = jdbcTemplate.queryForObject(sql, param, Integer.class);

        System.out.println("result = " + result);

/*
        // データ追加
        customerService.save(new Customer(1, "Nobita", "Nobi"));
        customerService.save(new Customer(2, "Takeshi", "Goda"));
        customerService.save(new Customer(3, "Suneo", "Hosokawa"));

        // データ表示
        customerService.findAll().forEach(System.out::println);
*/
    }

    public static void main(String[] args) {
        SpringApplication.run(App03.class, args);
    }

}
