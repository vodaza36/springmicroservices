package at.hochbichler.springmicroservices.userservice;

import at.hochbichler.springmicroservices.userservice.domain.UserEntity;
import at.hochbichler.springmicroservices.userservice.domain.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repo) {
		return (String... args) -> {
			repo.save(new UserEntity("vodaza36", "thomas@hochbichler.at"));
			log.info("Dummy users created!");

			UserEntity user1 = repo.findByEmail("thomas@hochbichler.at");
			log.info("Found registered user: " + user1);
		};
	}
}
