package lk.market.lanka.market.lanka.back.end.service.impl;

import lk.market.lanka.market.lanka.back.end.dto.UserRegistrationDTO;
import lk.market.lanka.market.lanka.back.end.entity.UserRegistrationentity;
import lk.market.lanka.market.lanka.back.end.exception.DuplicateEntryException;
import lk.market.lanka.market.lanka.back.end.exception.NotFoundException;
import lk.market.lanka.market.lanka.back.end.repo.UserrRegistrationRepo;
import lk.market.lanka.market.lanka.back.end.service.UserRegistration;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Optional;

@Service
public class UserRegistrationImpl implements UserRegistration {
    @Autowired
    private UserrRegistrationRepo customerRegistrationRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public Object saveAllDetails(UserRegistrationDTO customerRegistrationDTO) {
        UserRegistrationentity customerRegEntity = modelMapper.map(customerRegistrationDTO, UserRegistrationentity.class);
        UserRegistrationentity emailAndPhoneNumberEntity = customerRegistrationRepo.findByEmailAndPhone(customerRegistrationDTO.getEmail(),customerRegistrationDTO.getPhone());
        if(emailAndPhoneNumberEntity==null){
            this.customerRegistrationRepo.save(customerRegEntity);
            return "All data are saved";
        }else {
            return new DuplicateEntryException("Email or Phone Number Already exist");
        }
    }

    @Override
    public Object deleteUser(String id) {
        Optional<UserRegistrationentity> userEntity = this.customerRegistrationRepo.findById(Integer.parseInt(id));
        if(userEntity!=null){
            this.customerRegistrationRepo.deleteById(Integer.parseInt(id));
            return "user deleted";
        }else {
            NotFoundException notFoundException = new NotFoundException("User has not been registered yet");
            return  notFoundException;
        }
    }
}
