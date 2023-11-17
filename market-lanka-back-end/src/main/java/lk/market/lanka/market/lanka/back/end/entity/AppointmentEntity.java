package lk.market.lanka.market.lanka.back.end.entity;

import lk.market.lanka.market.lanka.back.end.entity.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Entity
@Table(name = "AppointmentEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "First_name",length = 200)
    private String userName;
    @Column(name = "Date_Time",length = 200)
    private LocalDateTime dateTime;
    @Enumerated
    @Column(name = "Status",length = 200)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private UserRegistrationentity user;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Appointment_Number",length = 200)
    private Long generatedAppointmentNumber;
    private static AtomicLong lastGeneratedValue = new AtomicLong(399L);
    @PrePersist
    public void generateCustomValue() {
        this.generatedAppointmentNumber = lastGeneratedValue.incrementAndGet();
    }
}
