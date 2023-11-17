package lk.market.lanka.market.lanka.back.end.entity;

import lk.market.lanka.market.lanka.back.end.entity.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TimeSlotEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeSlotEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Available_Date_Time",length = 200)
    private LocalDateTime availableDateAndTime;
    @Enumerated
    @Column(name = "Status",length = 200)
    private Status status;
}
