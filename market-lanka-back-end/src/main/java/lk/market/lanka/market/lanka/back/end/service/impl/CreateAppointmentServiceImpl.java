package lk.market.lanka.market.lanka.back.end.service.impl;

import lk.market.lanka.market.lanka.back.end.dto.AppointmentDTO;
import lk.market.lanka.market.lanka.back.end.entity.AppointmentEntity;
import lk.market.lanka.market.lanka.back.end.repo.CreateAppointmentRepo;
import lk.market.lanka.market.lanka.back.end.service.CreateAppontmentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreateAppointmentServiceImpl implements CreateAppontmentService {
    @Autowired
    private CreateAppointmentRepo createAppointmentRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void addAppointments(AppointmentDTO appointmentDTO) {
        AppointmentEntity appointmentEntity = this.modelMapper.map(appointmentDTO, AppointmentEntity.class);
        this.createAppointmentRepo.save(appointmentEntity);
    }
    @Override
    public Long getAppointmentNumber(String id) {
        Optional<AppointmentEntity> appointmentEntity = this.createAppointmentRepo.findById(Integer.parseInt(id));
        return appointmentEntity.get().getGeneratedAppointmentNumber();
    }
}
