package com.example.demon.dto.response.user;

import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewGetResponse {
    
    public static ResponseEntity<ReviewGetResponse> success(){
        ReviewGetResponse result = new ReviewGetResponse();
        return ResponseEntity.ok(result);
    }
}
