package com.graccasoft.redkokia.model.dto;

public record RegisterUserDto(

        Long id,
        String firstName,
        String lastName,
        String username,
        String password,
        String role,
        TenantDto tenant
) {
}
