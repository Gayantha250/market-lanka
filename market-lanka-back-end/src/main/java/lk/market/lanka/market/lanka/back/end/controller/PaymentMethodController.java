package lk.market.lanka.market.lanka.back.end.controller;

import lk.market.lanka.market.lanka.back.end.dto.CustomerRegistrationDTO;
import lk.market.lanka.market.lanka.back.end.dto.PaymentDetailsDTO;
import lk.market.lanka.market.lanka.back.end.service.PaymentMethodService;
import lk.market.lanka.market.lanka.back.end.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/PaymentController")
@CrossOrigin
public class PaymentMethodController {
@Autowired
private PaymentMethodService paymentMethodService;

    @PostMapping("/save")
    private ResponseEntity<StandardResponse> saveCustomerData(@RequestBody PaymentDetailsDTO PaymentDetailsDTO){
        paymentMethodService.saveAllDetails(PaymentDetailsDTO);
        return new ResponseEntity<>(new StandardResponse(201,"saved"), HttpStatus.CREATED);
    }
}
