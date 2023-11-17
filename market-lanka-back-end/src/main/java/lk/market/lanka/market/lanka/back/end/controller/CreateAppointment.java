package lk.market.lanka.market.lanka.back.end.controller;


import lk.market.lanka.market.lanka.back.end.dto.AppointmentDTO;
import lk.market.lanka.market.lanka.back.end.dto.UserRegistrationDTO;
import lk.market.lanka.market.lanka.back.end.service.CreateAppontmentService;
import lk.market.lanka.market.lanka.back.end.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@RestController
@RequestMapping("/CreateAppointment")
@CrossOrigin
public class CreateAppointment {

    @Autowired
    private CreateAppontmentService createAppontmentService;
    @PostMapping("/addAppointments")
    private ResponseEntity<StandardResponse> saveCustomerData(@RequestBody AppointmentDTO appointmentDTO){
        createAppontmentService.addAppointments(appointmentDTO);
        return new ResponseEntity<>(new StandardResponse(201,"your appointment number has been sent to your mobile"), HttpStatus.CREATED);
    }
    @GetMapping("/getAppointmentCode/{id}")
    private ResponseEntity<StandardResponse> getAppointmentNumber(@PathVariable(value = "id") String id){
        Long appointmentNumber = this.createAppontmentService.getAppointmentNumber(id);
        return new ResponseEntity<>(new StandardResponse(200,Long.toString(appointmentNumber)), HttpStatus.CREATED);
    }

}
