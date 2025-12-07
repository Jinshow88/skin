package com.example.demon.dto.response.owner;

import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomUpdateResponse {

    public static ResponseEntity<RoomUpdateResponse> success() {
        RoomUpdateResponse result = new RoomUpdateResponse();
        return ResponseEntity.ok(result);
    }
}
