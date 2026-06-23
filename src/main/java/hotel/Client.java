package hotel;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Client {
    private String firstName;
    private String lastName;
    private String telephone;
    private String creditCard;
    private String address;
    private String CIN;


}