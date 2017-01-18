package at.hochbichler.springmicroservices.productservice;

import at.hochbichler.springmicroservices.productservice.domain.Product;
import at.hochbichler.springmicroservices.productservice.domain.ProductRepository;
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
public class ProductserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceApplication.class, args);
	}

	@Profile("dev")
	@Bean
	public CommandLineRunner demo(ProductRepository repo) {
		return (String... args) -> {
			repo.save(new Product("Product A"));
			repo.save(new Product("Product B"));
			repo.save(new Product("Product C"));
			log.info("Dummy products created!");

			Iterable<Product> products = repo.findAll();

			for (Product product : products) {
				log.info("Found product: " + product);
			}
		};
	}
}
