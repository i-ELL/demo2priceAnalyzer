package com.example.demo2priceanalyzer.analyzer.domain.dto;

import com.example.demo2priceanalyzer.analyzer.domain.models.User;
import lombok.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserInfoDTO {
    private boolean isAuth;
    private User user;
}