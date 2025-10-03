package com.pankaj.crud_api.dto.auth_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterDto {

    private String email;
    private String password;
    private String fullName;

}
