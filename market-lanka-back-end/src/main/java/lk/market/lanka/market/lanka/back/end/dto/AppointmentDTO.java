package lk.market.lanka.market.lanka.back.end.dto;

import lk.market.lanka.market.lanka.back.end.entity.UserRegistrationentity;
import lk.market.lanka.market.lanka.back.end.entity.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {
    private String userName;
    private LocalDateTime dateTime;
    private Status status;
    private UserRegistrationDTO user;
}
