package com.example.demon.dto.response.login;

import com.example.demon.entity.UserEntity;

import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSignUpResponse {

    private UserEntity userEntity;

    public static ResponseEntity<UserSignUpResponse> success(UserEntity userEntity) {
        UserSignUpResponse result = new UserSignUpResponse(userEntity);
        return ResponseEntity.ok(result);
    }
}
