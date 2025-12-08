package com.example.demon.controller;

import com.example.demon.dto.request.user.ReviewDeleteRequest;
import com.example.demon.dto.request.user.ReviewGetRequest;
import com.example.demon.dto.request.user.ReviewPostRequest;
import com.example.demon.dto.response.user.ReviewDeleteResponse;
import com.example.demon.dto.response.user.ReviewGetResponse;
import com.example.demon.dto.response.user.ReviewPostResponse;
import com.example.demon.service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@Tag(name = "예약")
public class UserController {
    private final UserService userservice;

    
    // 마이페이지 - 예약 내역 불러오기 //

    // 마이페이지 - 예약 취소하기 //

    // 마이페이지 - 리뷰 작성하기 //
    @PostMapping("/post_Review")
    public ResponseEntity<ReviewPostResponse> postReview(ReviewPostRequest dto){

        return userservice.postReview(dto);
    }

    // 마이페이지 - 리뷰 삭제하기 //
    @DeleteMapping("/delete_Review")
    public ResponseEntity<ReviewDeleteResponse> deleteReview(ReviewDeleteRequest dto){

        return userservice.deleteReview(dto);
    }

    // 마이페이지 - 리뷰 불러오기 //
    @GetMapping("/get_Review")
    public ResponseEntity<ReviewGetResponse> getReview(ReviewGetRequest dto){

        return userservice.getReview(dto);
    }

    // 마이페이지 - 관심 글램핑 불러오기 //

    // 마이페이지 - 내 정보 불러오기 //

    // 마이페이지 - 내 정보 수정하기 //

    // 마이페이지 - 회원 탈퇴 //

    // 마이페이지 - 비밀번호 체크 //
}
