package com.pankaj.crud_api.dto;

import java.util.Date;

public record TodoResponseDto(String task, String status, Date date, UserDto usr) {

}
