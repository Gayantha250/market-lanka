package lk.market.lanka.market.lanka.back.end.service;

import lk.market.lanka.market.lanka.back.end.dto.UserRegistrationDTO;

public interface UserRegistration {
    Object saveAllDetails(UserRegistrationDTO customerRegistrationDTO);

    Object deleteUser(String id);
}
