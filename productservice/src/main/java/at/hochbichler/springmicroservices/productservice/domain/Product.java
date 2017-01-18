package at.hochbichler.springmicroservices.productservice.domain;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xhocht on 18.01.17.
 */
@Entity
@Value
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class Product {
    @Id
    @GeneratedValue
    @NonFinal
    private Long id;
    @NonNull
    private String name;
}
