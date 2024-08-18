package leopoldo.silva.projeto.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

@EnableFeignClients
@SpringBootApplication
@Service
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}