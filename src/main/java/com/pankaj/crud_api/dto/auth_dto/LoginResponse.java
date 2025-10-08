package com.pankaj.crud_api.dto.auth_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

    private String token;

    private String email;

    private Long userId;

    private String fullName;

    private String role;

    private long expiresIn;

    private int status;

}
