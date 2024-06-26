package mock_testing_l8.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import mock_testing_l8.entity.AuthUser;

import java.io.Serializable;

/**
 * DTO for {@link AuthUser}
 */
@AllArgsConstructor
@Getter
public class AuthUserGetDto implements Serializable {
    @NotBlank(message = "username can not be blank")
    private String username;
    @NotBlank(message = "email can not be blank")
    private String email;
}