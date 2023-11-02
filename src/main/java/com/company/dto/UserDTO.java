package com.company.dto;

import com.company.entity.User;
import lombok.*;
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String name;
    private String surname;
    private String email;
    private String password;
}
