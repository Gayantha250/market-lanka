package lk.market.lanka.market.lanka.back.end.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CustomerRegistration")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationentity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "First_name",length = 200)
    private String FirstName;
    @Column(name = "Last_name",length = 200)
    private String LastName;
    @Column(name = "Password",length = 100)
    private String password;
    @Column(name = "phone_number",length = 100)
    private String phone;
    @Column(name = "email",length = 100)
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<AppointmentEntity> appointments;
    @OneToOne(mappedBy = "user")
    private ShippingCartEntity shippingCartEntity;
    @OneToMany(mappedBy="userRegistrationentity")
    private Set<OrderEntity> items;

}
