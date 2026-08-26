package com.github.grigorevmaximandreevich.bicycleshop.dto.user;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterUserRequest {

    @Email(message = "Email не должен быть пустым")
    @NotBlank(message = "Некорректный формат email")
    private String email;

    @NotBlank
    @Size(min = 8, max = 100)
    private String password;

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
