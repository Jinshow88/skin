package com.example.demon.controller;

import com.example.demon.dto.request.BookPostRequest;
import com.example.demon.dto.response.book.BookPostResponse;
import com.example.demon.service.BookService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/book")
@Tag(name = "예약")
public class BookController {
    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookPostResponse> postBook(@RequestBody BookPostRequest dto) {

        return bookService.postBook(dto);
    }
}
