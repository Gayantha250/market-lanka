package lk.market.lanka.market.lanka.back.end.repo;

import lk.market.lanka.market.lanka.back.end.entity.CustomerRegistrationentity;
import lk.market.lanka.market.lanka.back.end.entity.SupplierRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface SupplierRegistraionRepo extends JpaRepository<SupplierRegistrationEntity,Integer> {
    CustomerRegistrationentity findByEmail(String email);
}
