package lk.market.lanka.market.lanka.back.end.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;

@Entity
@Table(name = "ShippingDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "COUNTRY_OF_ORIGIN",length = 200)
    private String countryOfOrigin;
    @Column(name = "FIRST_NAME",length = 200)
    private String firstName;
    @Column(name = "LAST_NAME",length = 200)
    private String lastName;
    @Column(name = "ADDRESS",length = 200)
    private String address;
    @Column(name = "CITY",length = 200)
    private String city;
    @Column(name = "STATE",length = 200)
    private String province;
    @Column(name = "ZIP_CODE",length = 200)
    private String zipCode;
    @Column(name = "EMAIL",length = 200)
    private String email;
    @Column(name = "PHONE_NUMBER",length = 200)
    private String phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_registration_id", referencedColumnName = "id")
    private CustomerRegistrationentity customerRegistrationentity;

    public ShippingDetails(String firstName, String lastName, String phoneNumber, CustomerRegistrationentity customerRegistrationentity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.customerRegistrationentity = customerRegistrationentity;
    }
}
