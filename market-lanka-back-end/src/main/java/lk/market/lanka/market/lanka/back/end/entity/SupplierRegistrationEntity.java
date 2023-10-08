package lk.market.lanka.market.lanka.back.end.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "SupplierRegistration")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierRegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "First_name",nullable = false, length = 200)
    private String firstName;
    @Column(name = "Last_name",length = 150,nullable = false)
    private String lastName;
    @Column(name = "Phone_number",length = 100, nullable = false)
    private String phoneNumber;
    @Column(name = "Email",length = 100, nullable = false)
    private String email;
    @Column(name = "COUNTRY",length = 100, nullable = false)
    private String country;
    @Column(name = "ADDRESS",length = 100, nullable = false)
    private String address;
}
