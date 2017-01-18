package at.hochbichler.springmicroservices.userservice.infra;

import at.hochbichler.springmicroservices.userservice.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xhocht on 09.01.17.
 */
@RepositoryRestResource(itemResourceRel = "User", path = "user")
public interface UserRestService extends PagingAndSortingRepository<User, Long> {
    User findByEmail(@Param("email") String email);
}