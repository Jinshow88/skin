package com.example.demon.dto.response.user;

import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDeleteResponse {
    
    public static ResponseEntity<ReviewDeleteResponse> success(){
        ReviewDeleteResponse result = new ReviewDeleteResponse();
        return ResponseEntity.ok(result);
    }
}
