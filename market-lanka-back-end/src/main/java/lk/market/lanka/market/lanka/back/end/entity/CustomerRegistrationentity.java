package lk.market.lanka.market.lanka.back.end.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;

@Entity
@Table(name = "CustomerRegistration")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRegistrationentity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "First_name",nullable = false, length = 200)
    private String firstName;
    @Column(name = "Last_name",length = 150,nullable = false)
    private String lastName;
    @Column(name = "Phone_number",length = 100, nullable = false)
    private String phoneNumber;
    @Column(name = "email",length = 100, nullable = false)
    private String email;

    @OneToOne(mappedBy = "customerRegistrationentity")
    private ShippingDetails shippingDetails;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentDetails_id", referencedColumnName = "id")
    private paymentDetails paymentDetails;

}
