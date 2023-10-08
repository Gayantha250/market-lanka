package lk.market.lanka.market.lanka.back.end.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerRegistrationDTO implements Serializable {
    private String FirstName;
    private String LastName;
    private String phoneNumber;
    private String Email;

}
