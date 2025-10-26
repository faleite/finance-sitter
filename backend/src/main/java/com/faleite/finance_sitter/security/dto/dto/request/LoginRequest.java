package com.faleite.finance_sitter.security.dto.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(@NotEmpty(message = "Email is required") String email,
                           @NotEmpty(message = "Password is required") String password) {
}
