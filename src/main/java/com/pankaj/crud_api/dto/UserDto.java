package com.pankaj.crud_api.dto;

import com.pankaj.crud_api.models.Role;

public record UserDto(String email, String fullName, Role role) {
}
