package lk.market.lanka.market.lanka.back.end.service.impl;

import lk.market.lanka.market.lanka.back.end.dto.CustomerRegistrationDTO;
import lk.market.lanka.market.lanka.back.end.entity.CustomerRegistrationentity;
import lk.market.lanka.market.lanka.back.end.entity.ShippingDetails;
import lk.market.lanka.market.lanka.back.end.exception.DuplicateEntryException;
import lk.market.lanka.market.lanka.back.end.repo.CustomerRegistrationRepo;
import lk.market.lanka.market.lanka.back.end.repo.ShippingDetailsRepo;
import lk.market.lanka.market.lanka.back.end.service.CustomerRegistration;
import lk.market.lanka.market.lanka.back.end.util.StandardResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class CustomerRegistrationImpl implements CustomerRegistration {
    @Autowired
    private CustomerRegistrationRepo customerRegistrationRepo;
    @Autowired
    private ShippingDetailsRepo shippingDetailsRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    @Transactional
    public void saveAllDetails(CustomerRegistrationDTO customerRegistrationDTO) {
        HashMap<String,String> customerRegistrationDetails= new HashMap<>();

        customerRegistrationDetails.put("firstName",customerRegistrationDTO.getFirstName());
        customerRegistrationDetails.put("lastName",customerRegistrationDTO.getLastName());
        customerRegistrationDetails.put("phoneNumber",customerRegistrationDTO.getPhoneNumber());
        CustomerRegistrationentity customerRegEntity = modelMapper.map(customerRegistrationDTO, CustomerRegistrationentity.class);
        CustomerRegistrationentity byEmail = customerRegistrationRepo.findByEmail(customerRegistrationDTO.getEmail());
        if(byEmail==null){
            customerRegistrationRepo.save(customerRegEntity);
            ShippingDetails shippingDetails = new ShippingDetails(customerRegistrationDetails.get("firstName"), customerRegistrationDetails.get("lastName"), customerRegistrationDetails.get("phoneNumber"), customerRegEntity);
            shippingDetailsRepo.save(shippingDetails);
        }else {
            throw new DuplicateEntryException("Duplicate Entry");
        }
    }
}
