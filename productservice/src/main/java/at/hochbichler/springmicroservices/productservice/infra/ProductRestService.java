package at.hochbichler.springmicroservices.productservice.infra;

import at.hochbichler.springmicroservices.productservice.domain.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by xhocht on 18.01.17.
 */
@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRestService extends PagingAndSortingRepository<Product, Long> {
    Product findByName(@Param("name") String name);
}
