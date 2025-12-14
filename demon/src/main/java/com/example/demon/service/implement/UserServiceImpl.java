package com.example.demon.service.implement;

import java.util.Objects;

import com.example.demon.dto.request.user.ReviewDeleteRequest;
import com.example.demon.dto.request.user.ReviewGetRequest;
import com.example.demon.dto.request.user.ReviewPostRequest;
import com.example.demon.dto.response.user.ReviewDeleteResponse;
import com.example.demon.dto.response.user.ReviewGetResponse;
import com.example.demon.dto.response.user.ReviewPostResponse;
import com.example.demon.entity.GlampingEntity;
import com.example.demon.entity.ReservationCompleteEntity;
import com.example.demon.entity.ReviewEntity;
import com.example.demon.entity.UserEntity;
import com.example.demon.repository.GlampingRepository;
import com.example.demon.repository.ReservationCompleteRepository;
import com.example.demon.repository.ReviewRepository;
import com.example.demon.repository.UserRepository;
import com.example.demon.service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final GlampingRepository glampingRepository;
    private final ReservationCompleteRepository reservationCompleteRepository;
    private final ReviewRepository reviewRepository;
    // 마이페이지 - 예약 내역 불러오기 //

    // 마이페이지 - 예약 취소하기 //

    // 마이페이지 - 리뷰 작성하기 //
    @Override
    @Transactional
    public ResponseEntity<ReviewPostResponse> postReview(ReviewPostRequest dto) {
        UserEntity users = userRepository
                .findById(Objects.requireNonNull(dto.getUserId(), "유저 ID는 필수 입니다."))
                .orElseThrow(() -> new RuntimeException("유저 정보 없음"));
        GlampingEntity glamping = glampingRepository
                .findById(Objects.requireNonNull(dto.getGlampId(), "캠핑 ID는 필수 입니다."))
                .orElseThrow(() -> new RuntimeException("캠핑 정보 없음"));
        ReservationCompleteEntity complet = reservationCompleteRepository
                .findById(Objects.requireNonNull(dto.getReservationId(), "완료된 캠핑 ID는 필수 입니다."))
                .orElseThrow(() -> new RuntimeException("완료된 캠핑 정보 없음"));
        ReviewEntity reviewEntity = new ReviewEntity();
        reviewEntity.setGlampId(glamping);
        reviewEntity.setUserId(users);
        reviewEntity.setReservationId(complet);
        reviewEntity.setReviewStarPoint(dto.getReviewStarPoint());
        reviewEntity.setReviewContent(dto.getReviewContent());

        reviewEntity = reviewRepository.save(reviewEntity);


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
    public ResponseEntity<ReviewGetResponse> getReview(ReviewGetRequest dto) {
        return ReviewGetResponse.success();
    }

    // 마이페이지 - 관심 글램핑 불러오기 //

    // 마이페이지 - 내 정보 불러오기 //

    // 마이페이지 - 내 정보 수정하기 //

    // 마이페이지 - 회원 탈퇴 //

    // 마이페이지 - 비밀번호 체크 //
}
