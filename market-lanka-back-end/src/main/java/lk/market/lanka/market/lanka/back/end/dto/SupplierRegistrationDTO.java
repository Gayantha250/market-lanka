package lk.market.lanka.market.lanka.back.end.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class SupplierRegistrationDTO implements Serializable {

    private String FirstName;
    private String LastName;
    private String phoneNumber;
    private String Email;
    private String country;
    private String address;
}
