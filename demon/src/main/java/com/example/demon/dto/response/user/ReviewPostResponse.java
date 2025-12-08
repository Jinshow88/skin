package com.example.demon.dto.response.user;

import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewPostResponse {

    public static ResponseEntity<ReviewPostResponse> success() {
        ReviewPostResponse result = new ReviewPostResponse();
        return ResponseEntity.ok(result);
    }
}
