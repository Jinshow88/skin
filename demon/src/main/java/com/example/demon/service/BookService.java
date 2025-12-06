package com.example.demon.service;

import com.example.demon.dto.request.BookRequest;
import com.example.demon.dto.response.BookResponse;

import org.springframework.http.ResponseEntity;

public interface BookService {

    // 글램핑 예약하기 //
    ResponseEntity<BookResponse> postBook(BookRequest dto);
    // 예약 페이지 - 최종 결제 가격정보 //

    // 스케줄 실행 - 체크아웃 날짜가 지나면, 이용완료 테이블로 이동 //

}