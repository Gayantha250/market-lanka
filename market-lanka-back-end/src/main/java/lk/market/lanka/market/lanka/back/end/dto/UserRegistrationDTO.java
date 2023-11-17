package lk.market.lanka.market.lanka.back.end.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDTO implements Serializable {
    private String FirstName;
    private String LastName;
    private String password;
    private String phone;
    private String Email;

}
