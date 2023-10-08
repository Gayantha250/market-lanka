package lk.market.lanka.market.lanka.back.end.controller;

import lk.market.lanka.market.lanka.back.end.dto.CustomerRegistrationDTO;
import lk.market.lanka.market.lanka.back.end.dto.SupplierRegistrationDTO;
import lk.market.lanka.market.lanka.back.end.service.SupplierRegistration;
import lk.market.lanka.market.lanka.back.end.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/SupplierRegistration")
@CrossOrigin
public class SupplierRegistrationController {

    @Autowired
    private SupplierRegistration supplierRegistration;

    @PostMapping("/save")
    private ResponseEntity<StandardResponse> saveCustomerData(@RequestBody SupplierRegistrationDTO supplierRegistrationDTO){
        supplierRegistration.saveAllDetails(supplierRegistrationDTO);
        return new ResponseEntity<>(new StandardResponse(201,"saved"), HttpStatus.CREATED);
    }
}
