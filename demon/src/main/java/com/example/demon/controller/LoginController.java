package com.example.demon.controller;

import com.example.demon.dto.request.LoginRequest;
import com.example.demon.dto.response.LoginResponse;
import com.example.demon.service.LoginService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/login")
@Tag(name = "로그인")
public class LoginController {
    private final LoginService loginService;
    // 최초 실행 시, 초기화를 한번만 진행 //

    // 6자리의 랜덤 숫자코드를 생성 //

    // 로그인 및 회원가입 페이지 - 이메일 회원가입 처리 //

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> postLogin(@RequestBody LoginRequest dto) {
        return loginService.postLogin(dto);
    }
    // 로그인 및 회원가입 페이지 - 소셜 회원가입 처리 //

    // 로그인 및 회원가입 페이지 - 사장님 회원가입 처리 //
    @PostMapping("/owner_sign_up")
    public ResponseEntity<LoginResponse> ownerSignUp(@RequestBody LoginRequest dto){
        return loginService.ownerSignUp(dto);
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
