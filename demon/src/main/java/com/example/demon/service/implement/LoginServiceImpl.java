package com.example.demon.service.implement;

import com.example.demon.common.Role;
import com.example.demon.dto.request.login.OwnerSignUpRequest;
import com.example.demon.dto.request.login.UserSignUpRequest;
import com.example.demon.dto.response.LoginResponse;
import com.example.demon.entity.OwnerEntity;
import com.example.demon.entity.UserEntity;
import com.example.demon.repository.OwnerRepositroy;
import com.example.demon.repository.UserRepository;
import com.example.demon.service.LoginService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final UserRepository userRepository;
    private final OwnerRepositroy ownerRepositroy;
    // 최초 실행 시, 초기화를 한번만 진행 //

    // 6자리의 랜덤 숫자코드를 생성 //

    // 로그인 및 회원가입 페이지 - 이메일 회원가입 처리 //
    @Override
    @Transactional
    public ResponseEntity<LoginResponse> postLogin(UserSignUpRequest dto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(dto.getUserName());
        userEntity.setUserPw(dto.getUserPw());
        userEntity.setUserEmail(dto.getUserEmail());
        userEntity.setUserNickname(dto.getUserNickname());
        userEntity.setUserPhone(dto.getUserPhone());
        userEntity.setRole(Role.ROLE_USER);
        userEntity.setActivateStatus(1);
        userEntity.setUserProfileImage(dto.getUserProfile());

        userEntity = userRepository.save(userEntity);
        return LoginResponse.success(userEntity);
    }
    // 로그인 및 회원가입 페이지 - 소셜 회원가입 처리 //

    // 로그인 및 회원가입 페이지 - 사장님 회원가입 처리 //
    @Override
    @Transactional
    public ResponseEntity<LoginResponse> ownerSignUp(OwnerSignUpRequest dto) {
        OwnerEntity ownerEntity = new OwnerEntity();
        ownerEntity.setActivateStatus(1);
        ownerEntity.setBusinessNumber(dto.getBusinessNumber());
        ownerEntity.setBusinessPaperImage(dto.getBusinessPaper());
        ownerEntity.setGlampingStatus(1);
        ownerEntity.setOwnerEmail(dto.getOwnerEmail());
        ownerEntity.setOwnerName(dto.getOwnerName());
        ownerEntity.setOwnerPhone(dto.getOwnerPhone());
        ownerEntity.setOwnerPw(dto.getOwnerPw());
        ownerEntity.setRole(Role.ROLE_OWNER);

        ownerEntity = ownerRepositroy.save(ownerEntity);

        return LoginResponse.success(ownerEntity);
    }

    // 로그인 및 회원가입 페이지 - 이메일 로그인 처리 //

    // 로그인 및 회원가입 페이지 - 사장님 로그인 처리 //

    // 로그인 및 회원가입 페이지 - 관리자 로그인 처리 //

    // AccessToken 불러오기 //

    // 로그아웃 처리하기 //

    // 로그인 및 회원가입 페이지 - 유저 휴대폰 인증 문자 보내기 //

    // 로그인 및 회원가입 페이지 - 유저 휴대폰 인증코드 체크하기 //

    // 로그인 및 회원가입 페이지 - 유저 이메일 인증 보내기 //

    // 로그인 및 회원가입 페이지 - 유저 이메일 코드 체크하기 //

    // 로그인 및 회원가입 페이지 - 사장님 휴대폰 인증 문자 보내기 //

    // 로그인 및 회원가입 페이지 - 사장님 휴대폰 인증코드 체크하기 //

    // 로그인 및 회원가입 페이지 - 사장님 이메일 인증 보내기 //

    // 로그인 및 회원가입 페이지 - 사장님 이메일 코드 체크하기 //

    // 로그인 및 회원가입 페이지 - 유저 이메일 찾기 //

    // 로그인 및 회원가입 페이지 - 유저 이메일 찾기 - 휴대폰 인증 보내기 //

    // 로그인 및 회원가입 페이지 - 유저 이메일 찾기 - 휴대폰 인증 체크하기 //

    // 로그인 및 회원가입 페이지 - 유저 비밀번호 찾기 후 변경 처리 //

    // 로그인 및 회원가입 페이지 - 유저 비밀번호 찾기 - 이메일 인증 보내기 //

    // 로그인 및 회원가입 페이지 - 유저 비밀번호 찾기 - 이메일 인증 체크하기 //

    // 로그인 및 회원가입 페이지 - 사장님 이메일 찾기 //

    // 로그인 및 회원가입 페이지 - 사장님 이메일 찾기 - 휴대폰 인증 보내기 //

    // 로그인 및 회원가입 페이지 - 사장님 이메일 찾기 - 휴대폰 인증 체크하기 //

    // 로그인 및 회원가입 페이지 - 사장님 비밀번호 검증 후 변경처리 //

    // 로그인 및 회원가입 페이지 - 사장님 비밀번호 찾기 - 이메일 인증 보내기 //

    // 로그인 및 회원가입 페이지 - 사장님 비밀번호 찾기 - 이메일 인증 체크하기 //

}
