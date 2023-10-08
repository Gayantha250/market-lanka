package lk.market.lanka.market.lanka.back.end.repo;

import lk.market.lanka.market.lanka.back.end.entity.CustomerRegistrationentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CustomerRegistrationRepo extends JpaRepository<CustomerRegistrationentity,Integer> {
    CustomerRegistrationentity findByEmail(String email);
}
