package com.pankaj.crud_api.dto;

import java.util.Date;
import java.util.UUID;

public record TodoResponseDto(UUID taskId, String task, String status, Date date, UserDto usr) {

}
