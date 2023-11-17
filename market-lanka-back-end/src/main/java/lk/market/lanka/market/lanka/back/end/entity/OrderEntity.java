package lk.market.lanka.market.lanka.back.end.entity;

import lk.market.lanka.market.lanka.back.end.entity.enums.ShippingStatus;
import lk.market.lanka.market.lanka.back.end.entity.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "OrderEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private UserRegistrationentity userRegistrationentity;
    @Column(name = "Date_And_Time",length = 200)
    private LocalDateTime dateTime;
    @Column(name = "Total_Amount",length = 200)
    private String totalAmount;
    @Column(name = "PAyment_Info",length = 200)
    private ShippingStatus status;
}
