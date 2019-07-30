package arhs.training.springsecurity.domain.dto.request;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ARHS Spikeseed.
 */

@Getter
@Setter
public class LoginFormRequestDTO {

    private String email;
    private String password;
}
