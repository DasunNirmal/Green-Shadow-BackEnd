package lk.ijse.greenshadow.service;

import lk.ijse.greenshadow.dto.impl.StaffFiledDtoImpl;

import java.util.List;

public interface StaffAndFieldDetailsService {
    void saveDetails(StaffFiledDtoImpl staffFiledDto);
    List<StaffFiledDtoImpl> loadAllStaffDetails();
}