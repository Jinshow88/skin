package com.example.demon.dto.response;

import com.example.demon.entity.OwnerEntity;
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
public class LoginResponse {

    private UserEntity userEntity;
    private OwnerEntity ownerEntity;

    public LoginResponse(UserEntity user){
        this.userEntity = user;
        this.ownerEntity = null;
    }

    public LoginResponse(OwnerEntity owner){
        this.userEntity = null;
        this.ownerEntity = owner;
    }

    public static ResponseEntity<LoginResponse> success(UserEntity user) {
        LoginResponse result = new LoginResponse(user);
        return ResponseEntity.ok(result);
    }

    public static ResponseEntity<LoginResponse> success(OwnerEntity owner){
        LoginResponse result = new LoginResponse(owner);
        return ResponseEntity.ok(result);
    }
}
