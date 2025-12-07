package com.example.demon.dto.response.owner;

import com.example.demon.dto.objest.owner.GlampingPostObjest;

import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GlampingPostResponse {

    private GlampingPostObjest glampingObjest;

    public static ResponseEntity<GlampingPostResponse> success(GlampingPostObjest glampingObjest) {
return ResponseEntity.ok(new GlampingPostResponse(glampingObjest));
    }
}
