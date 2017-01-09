package at.hochbichler.springmicroservices.domain;

import lombok.Value;
import lombok.experimental.NonFinal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by xhocht on 09.01.17.
 */
@Entity
@Value
public class User {
    @Id @GeneratedValue @NonFinal
    private String id;
    @NotNull
    private String username;
    private String email;
    private Date creationDate;
}
