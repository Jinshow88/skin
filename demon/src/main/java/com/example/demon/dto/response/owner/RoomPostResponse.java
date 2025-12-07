package com.example.demon.dto.response.owner;

import com.example.demon.dto.objest.owner.RoomPostObjest;

import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomPostResponse {

    private RoomPostObjest roomObjest;

    public static ResponseEntity<RoomPostResponse> success(RoomPostObjest roomObjest) {
        RoomPostResponse result = new RoomPostResponse(roomObjest);
        return ResponseEntity.ok(result);
    }
}
