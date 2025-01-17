package com.picpaysimplificado.dtos;

import java.math.BigDecimal;

import com.picpaysimplificado.domain.user.UserType;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, UserType userType, String email, String password) {

}
