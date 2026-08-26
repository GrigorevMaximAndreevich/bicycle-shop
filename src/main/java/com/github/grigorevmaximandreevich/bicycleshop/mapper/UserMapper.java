package com.github.grigorevmaximandreevich.bicycleshop.mapper;

import com.github.grigorevmaximandreevich.bicycleshop.dto.user.UserResponse;
import com.github.grigorevmaximandreevich.bicycleshop.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toResponse(User user);
}
