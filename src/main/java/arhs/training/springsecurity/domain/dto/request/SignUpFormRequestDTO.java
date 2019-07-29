package arhs.training.springsecurity.domain.dto.request;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by ARHS Spikeseed.
 */

@Setter
@Getter
public class SignUpFormRequestDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
