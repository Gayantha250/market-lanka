package lk.market.lanka.market.lanka.back.end.service.impl;

import lk.market.lanka.market.lanka.back.end.dto.SupplierRegistrationDTO;
import lk.market.lanka.market.lanka.back.end.entity.CustomerRegistrationentity;
import lk.market.lanka.market.lanka.back.end.entity.SupplierRegistrationEntity;
import lk.market.lanka.market.lanka.back.end.exception.DuplicateEntryException;
import lk.market.lanka.market.lanka.back.end.repo.SupplierRegistraionRepo;
import lk.market.lanka.market.lanka.back.end.service.SupplierRegistration;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierRegistrationImpl implements SupplierRegistration {
    @Autowired
    private SupplierRegistraionRepo supplierRegistraionRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveAllDetails(SupplierRegistrationDTO supplierRegistrationDTO) {
        SupplierRegistrationEntity supplierEntity = modelMapper.map(supplierRegistrationDTO, SupplierRegistrationEntity.class);
        CustomerRegistrationentity byEmail = supplierRegistraionRepo.findByEmail(supplierRegistrationDTO.getEmail());
        if (byEmail == null) {
            supplierRegistraionRepo.save(supplierEntity);
        } else {
            throw new DuplicateEntryException("Email already Exist");
        }
    }
}
