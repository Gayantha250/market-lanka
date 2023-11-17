package lk.market.lanka.market.lanka.back.end.service;

import lk.market.lanka.market.lanka.back.end.dto.AppointmentDTO;

public interface CreateAppontmentService {
    void addAppointments(AppointmentDTO appointmentDTO);

    Long getAppointmentNumber(String id);
}
