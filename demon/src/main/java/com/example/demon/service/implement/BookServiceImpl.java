package com.example.demon.service.implement;

import com.example.demon.dto.request.BookRequest;
import com.example.demon.dto.response.BookResponse;
import com.example.demon.service.BookService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    // 글램핑 예약하기 //
    @Override
    @Transactional
    public ResponseEntity<BookResponse> postBook(BookRequest dto) {

        return BookResponse.success();
    }

    // 예약 페이지 - 최종 결제 가격정보 //

    // 스케줄 실행 - 체크아웃 날짜가 지나면, 이용완료 테이블로 이동 //
}
