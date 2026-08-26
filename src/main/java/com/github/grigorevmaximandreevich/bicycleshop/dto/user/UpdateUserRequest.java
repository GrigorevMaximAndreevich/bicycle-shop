package com.github.grigorevmaximandreevich.bicycleshop.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateUserRequest {

    @NotBlank
    @Pattern(
            regexp = "^[\\p{L}\\s-]+$",
            message = "Имя может содержать только буквы, пробелы или дефис"
    )
    private String firstName;

    @NotBlank
    @Pattern(
            regexp = "^[\\p{L}\\s-]+$",
            message = "Фамилия может содержать только буквы, пробелы или дефис"
    )
    private String lastName;
}
