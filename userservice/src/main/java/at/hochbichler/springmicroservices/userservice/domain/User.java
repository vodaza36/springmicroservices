package at.hochbichler.springmicroservices.userservice.domain;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xhocht on 09.01.17.
 */
@Entity
@Value
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class User {
    @Id @GeneratedValue @NonFinal
    private long id;
    @NonNull
    private String username;
    @NonNull
    private String email;
}
