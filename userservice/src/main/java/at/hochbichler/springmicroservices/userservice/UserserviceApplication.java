package at.hochbichler.springmicroservices.userservice;

import at.hochbichler.springmicroservices.userservice.domain.User;
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
			repo.save(new User("tom", "thomas@hochbichler.at"));
            repo.save(new User("julia", "julia@hochbichler.at"));
            repo.save(new User("marion", "marion@hochbichler.at"));
            log.info("Dummy users created!");

			User user1 = repo.findByEmail("thomas@hochbichler.at");
            User user2 = repo.findByEmail("julia@hochbichler.at");
            User user3 = repo.findByEmail("marion@hochbichler.at");
			log.info("Found user 1: " + user1);
            log.info("Found user 2: " + user2);
            log.info("Found user 3: " + user3);
		};
	}
}
