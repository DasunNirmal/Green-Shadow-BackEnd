package lk.ijse.greenshadow.dto.impl;

import lk.ijse.greenshadow.dto.StaffStatus;
import lk.ijse.greenshadow.dto.SuperDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StaffDtoImpl  implements SuperDto, StaffStatus {
    private String staff_id;
    private String first_name;
    private String last_name;
    private String designation;
    private String email;
    private String role;
    private String gender;
    private String joined_date;
    private String dob;
    private String address_01;
    private String address_02;
    private String address_03;
    private String address_04;
    private String address_05;
    private String phone_no;
}