package com.example.demon.dto.response.login;

import com.example.demon.entity.OwnerEntity;

import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerSignUpResponse {

    private OwnerEntity ownerEntity;

    public static ResponseEntity<OwnerSignUpResponse> success(OwnerEntity owner) {
        OwnerSignUpResponse result = new OwnerSignUpResponse(owner);
        return ResponseEntity.ok(result);
    }
}
