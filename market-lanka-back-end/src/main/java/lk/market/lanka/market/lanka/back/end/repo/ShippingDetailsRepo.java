package lk.market.lanka.market.lanka.back.end.repo;

import lk.market.lanka.market.lanka.back.end.entity.ShippingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ShippingDetailsRepo extends JpaRepository<ShippingDetails,Integer> {
}
