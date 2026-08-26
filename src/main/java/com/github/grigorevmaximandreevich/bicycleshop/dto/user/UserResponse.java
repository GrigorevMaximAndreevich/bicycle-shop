package com.github.grigorevmaximandreevich.bicycleshop.dto.user;


import com.github.grigorevmaximandreevich.bicycleshop.entity.Role;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class UserResponse {

    private UUID id;
    private String email;
    private String firstName;
    private String lastName;
    private Role role;
    private Instant createdAt;
}
