package com.example.demon.service;

import com.example.demon.dto.request.owner.GlampingPostRequest;
import com.example.demon.dto.request.owner.GlampingUpdateRequest;
import com.example.demon.dto.request.owner.RoomPostRequest;
import com.example.demon.dto.request.owner.RoomUpdateRequest;
import com.example.demon.dto.response.owner.GlampingPostResponse;
import com.example.demon.dto.response.owner.GlampingUpdateResponse;
import com.example.demon.dto.response.owner.RoomPostResponse;
import com.example.demon.dto.response.owner.RoomUpdateResponse;

import org.springframework.http.ResponseEntity;

public interface OwnerService {

    // 글램핑 등록
    ResponseEntity<GlampingPostResponse> postGlamping(GlampingPostRequest dto);

    // 글램핑 수정
    ResponseEntity<GlampingUpdateResponse> updateGlamping(GlampingUpdateRequest dto);

    // 글램핑 사진 수정

    // 객실 등록
    ResponseEntity<RoomPostResponse> postRoom(RoomPostRequest dto);

    // 객실 수정
    ResponseEntity<RoomUpdateResponse> updateRoom(RoomUpdateRequest dto);

    // 객실 삭제

    // 글램핑 정보 불러오기

    // 객실 정보 미리보기

    // 객실 정보 상세보기

    // 비밀번호 확인

    // 정보 불러오기

    // 사장님 정보 수정

    // 사장님 탈퇴 승인 요청

    // 사장님 답글달기

    // 예약 중 리스트 불러오기

    // 예약취소 리스트 불러오기

    // 예약완료 리스트 불러오기

    // 리뷰 리스트

    // 날짜별 예약건수

    // 성수기 비수기 등록

    // 성수기 기간 불러오기

    // 성수기 초기화

    // 이용 완료된 객실별 예약수

    // 별점

    // 예약 취소율

    // 매출

}
