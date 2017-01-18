package at.hochbichler.springmicroservices.productservice.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by xhocht on 18.01.17.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findByName(String name);
}
