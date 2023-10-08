package lk.market.lanka.market.lanka.back.end.controller;

import lk.market.lanka.market.lanka.back.end.dto.CustomerRegistrationDTO;
import lk.market.lanka.market.lanka.back.end.service.CustomerRegistration;
import lk.market.lanka.market.lanka.back.end.service.ShippingDetailsService;
import lk.market.lanka.market.lanka.back.end.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CustomerRegistration")
@CrossOrigin
public class CustomerRegistrationController {
    @Autowired
    private CustomerRegistration customerRegistration;
    @PostMapping("/save")
    private ResponseEntity<StandardResponse> saveCustomerData(@RequestBody CustomerRegistrationDTO customerRegistrationDTO){
            customerRegistration.saveAllDetails(customerRegistrationDTO);
            return new ResponseEntity<>(new StandardResponse(201,"saved"), HttpStatus.CREATED);
    }




}
