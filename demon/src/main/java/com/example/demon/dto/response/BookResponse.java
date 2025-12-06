package com.example.demon.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponse {

    public static ResponseEntity<BookResponse> success(){
        BookResponse result = new BookResponse();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
