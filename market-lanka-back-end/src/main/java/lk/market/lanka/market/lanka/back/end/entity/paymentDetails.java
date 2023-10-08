package lk.market.lanka.market.lanka.back.end.entity;

import lk.market.lanka.market.lanka.back.end.entity.enums.PaymentSelection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "paymentDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class paymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "CREDITCARD_NUMBER",nullable = false,length = 200)
    private String creditCardNumber;
    @Column(name = "HOLDER_NAME",nullable = false,length = 200)
    private String holderName;
    @Column(name = "BANK_NAME",nullable = false,length = 200)
    private String bankName;
    @Enumerated
    @Column(name = "SELECTION",nullable = false,length = 200)
    private PaymentSelection selection;

    @OneToOne(mappedBy = "paymentDetails")
    private CustomerRegistrationentity customerRegistrationentity;


}
