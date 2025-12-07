package com.example.demon.service.implement;

import com.example.demon.dto.objest.owner.GlampingPostObjest;
import com.example.demon.dto.objest.owner.RoomPostObjest;
import com.example.demon.dto.request.owner.GlampingPostRequest;
import com.example.demon.dto.request.owner.RoomPostRequest;
import com.example.demon.dto.response.owner.GlampingPostResponse;
import com.example.demon.dto.response.owner.RoomPostResponse;
import com.example.demon.entity.GlampingEntity;
import com.example.demon.entity.OwnerEntity;
import com.example.demon.entity.RoomEntity;
import com.example.demon.repository.GlampingRepository;
import com.example.demon.repository.OwnerRepository;
import com.example.demon.repository.ReviewRepository;
import com.example.demon.repository.RoomRepository;
import com.example.demon.service.OwnerService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final GlampingRepository glampingRepository;
    private final ReviewRepository reviewRepository;
    private final RoomRepository roomRepository;

    // 글램핑 등록
    @Override
    @Transactional
    public ResponseEntity<GlampingPostResponse> postGlamping(GlampingPostRequest dto) {
        OwnerEntity owner = ownerRepository.findById(dto.getOwnerId())
                .orElseThrow(() -> new RuntimeException("사장 정보 없음"));
        GlampingEntity glampingEntity = new GlampingEntity();
        glampingEntity.setOwner(owner);
        glampingEntity.setGlampImage(dto.getGlampImage());
        glampingEntity.setGlampName(dto.getGlampName());
        glampingEntity.setGlampCall(dto.getGlampCall());
        glampingEntity.setGlampIntro(dto.getGlampIntro());
        glampingEntity.setGlampLocation(dto.getGlampLocation());
        glampingEntity.setActivateStatus(dto.getActivateStatus());
        glampingEntity.setExtraCharge(dto.getExtraCharge());
        glampingEntity.setInfoBasic(dto.getInfoBasic());
        glampingEntity.setInfoNotice(dto.getInfoNotice());
        glampingEntity.setRecommendScore(dto.getRecommendScore());
        glampingEntity.setRegion(dto.getRegion());
        glampingEntity.setReviewCount(reviewRepository.countByGlampId_GlampId(dto.getGlampId()));
        glampingEntity.setStarPointAvg(0.0);
        glampingEntity.setTraffic(dto.getTraffic());

        glampingEntity = glampingRepository.save(glampingEntity);
        GlampingPostObjest responseDto = GlampingPostObjest.fromEntity(glampingEntity);

        return GlampingPostResponse.success(responseDto);

    }

    // 글램핑 수정

    // 글램핑 사진 수정

    // 객실 등록
    @Override
    @Transactional
    public ResponseEntity<RoomPostResponse> postRoom(RoomPostRequest dto) {
        GlampingEntity glamping = glampingRepository.findById(dto.getGlampId())
                .orElseThrow(() -> new RuntimeException("글램핑 정보 없음"));
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setGlampId(glamping);
        roomEntity.setRoomName(dto.getRoomName());
        roomEntity.setRoomNumPeople(dto.getRoomNumPeople());
        roomEntity.setRoomMaxPeople(dto.getRoomMaxPeople());
        roomEntity.setCheckInTime(dto.getCheckInTime());
        roomEntity.setCheckOutTime(dto.getCheckOutTime());

        roomEntity = roomRepository.save(roomEntity);

        RoomPostObjest roomObjest = RoomPostObjest.fromEntity(roomEntity);

        return RoomPostResponse.success(roomObjest);
    }

    // 객실 수정

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
