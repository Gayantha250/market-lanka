package lk.market.lanka.market.lanka.back.end.repo;

import lk.market.lanka.market.lanka.back.end.entity.UserRegistrationentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserrRegistrationRepo extends JpaRepository<UserRegistrationentity,Integer> {


    UserRegistrationentity findByEmailAndPhone(String email,String PhoneNumber);
}
