package lk.market.lanka.market.lanka.back.end.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SparePartsEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SparePartsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Name_of_the_part",length = 200)
    private String nameOfPart;
    @Column(name = "Description",length = 200)
    private String description;
    @Column(name = "Price",length = 200)
    private String price;
    @Column(name = "img_Url",length = 200)
    private String imgUrl;
    @ManyToMany(mappedBy = "parts")
    private Set<ShippingCartEntity>  cart = new HashSet<>();

}
