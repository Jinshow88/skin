package com.example.demon.dto.response.owner;

import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GlampingUpdateResponse {
    
    public static ResponseEntity<GlampingUpdateResponse> success(){
        GlampingUpdateResponse result = new GlampingUpdateResponse();
        return ResponseEntity.ok(result);
    }
}
