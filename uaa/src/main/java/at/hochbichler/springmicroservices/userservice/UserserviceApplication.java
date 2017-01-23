package at.hochbichler.springmicroservices.userservice;

import at.hochbichler.springmicroservices.userservice.domain.User;
import at.hochbichler.springmicroservices.userservice.domain.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Profile("dev")
	@Bean
	public CommandLineRunner demo(UserRepository repo) {
		return (String... args) -> {

            log.info("Dummy users created!");

		};
	}
}
