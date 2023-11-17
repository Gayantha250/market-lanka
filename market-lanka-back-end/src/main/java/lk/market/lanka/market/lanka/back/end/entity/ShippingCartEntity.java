package lk.market.lanka.market.lanka.back.end.entity;

import lk.market.lanka.market.lanka.back.end.entity.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ShippingCartEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippingCartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private UserRegistrationentity user;

    @Column(name = "Quantity",length = 200)
    private String quantity;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Cart_product",
            joinColumns = { @JoinColumn(name = "cart_id") },
            inverseJoinColumns = { @JoinColumn(name = "parts_id") }
    )
    Set<SparePartsEntity> parts = new HashSet<>();

}
