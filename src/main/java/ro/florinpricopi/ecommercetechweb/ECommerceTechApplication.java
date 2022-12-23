package ro.florinpricopi.ecommercetechweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SuppressWarnings("unused")
@SpringBootApplication
@EnableWebMvc
public class ECommerceTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceTechApplication.class, args);
	}

}
