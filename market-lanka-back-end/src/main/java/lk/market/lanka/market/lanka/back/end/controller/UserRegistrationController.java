package lk.market.lanka.market.lanka.back.end.controller;

import lk.market.lanka.market.lanka.back.end.dto.UserRegistrationDTO;
import lk.market.lanka.market.lanka.back.end.service.UserRegistration;
import lk.market.lanka.market.lanka.back.end.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CustomerRegistration")
@CrossOrigin
public class UserRegistrationController {
    @Autowired
    private UserRegistration userRegistration;
    @PostMapping("/save")
    private ResponseEntity<StandardResponse> saveCustomerData(@RequestBody UserRegistrationDTO customerRegistrationDTO){
        Object o = userRegistration.saveAllDetails(customerRegistrationDTO);
        return new ResponseEntity<>(new StandardResponse(201,o.toString()), HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    private ResponseEntity<StandardResponse> deleteUser(@PathVariable(value = "id") String id){
        Object results = userRegistration.deleteUser(id);
        return new ResponseEntity<>(new StandardResponse(204,"deleted",results),HttpStatus.NO_CONTENT);
    }

}
