package lk.market.lanka.market.lanka.back.end.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShippingDetailsDTO implements Serializable {
    private String countryOfOrigin;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String province;
    private String zipCode;
    private String email;
    private String phoneNumber;
}
