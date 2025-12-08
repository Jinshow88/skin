package com.example.demon.service.implement;

import com.example.demon.dto.request.user.ReviewDeleteRequest;
import com.example.demon.dto.request.user.ReviewGetRequest;
import com.example.demon.dto.request.user.ReviewPostRequest;
import com.example.demon.dto.response.user.ReviewDeleteResponse;
import com.example.demon.dto.response.user.ReviewGetResponse;
import com.example.demon.dto.response.user.ReviewPostResponse;
import com.example.demon.service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    // 마이페이지 - 예약 내역 불러오기 //

    // 마이페이지 - 예약 취소하기 //

    // 마이페이지 - 리뷰 작성하기 //
    @Override
    @Transactional
    public ResponseEntity<ReviewPostResponse> postReview(ReviewPostRequest dto) {
        return ReviewPostResponse.success();
    }

    // 마이페이지 - 리뷰 삭제하기 //
    @Override
    @Transactional
    public ResponseEntity<ReviewDeleteResponse> deleteReview(ReviewDeleteRequest dto) {
        return ReviewDeleteResponse.success();
    }

    // 마이페이지 - 리뷰 불러오기 //
    @Override
    @Transactional
    public ResponseEntity<ReviewGetResponse> getReview(ReviewGetRequest dto){
        return ReviewGetResponse.success();
    }

    // 마이페이지 - 관심 글램핑 불러오기 //

    // 마이페이지 - 내 정보 불러오기 //

    // 마이페이지 - 내 정보 수정하기 //

    // 마이페이지 - 회원 탈퇴 //

    // 마이페이지 - 비밀번호 체크 //
}
