package com.example.demon.dto.response.book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookPostResponse {

    public static ResponseEntity<BookPostResponse> success(){
        BookPostResponse result = new BookPostResponse();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
