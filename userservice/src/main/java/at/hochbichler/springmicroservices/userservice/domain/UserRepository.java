package at.hochbichler.springmicroservices.userservice.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by xhocht on 09.01.17.
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
