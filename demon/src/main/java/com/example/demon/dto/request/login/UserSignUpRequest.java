package com.example.demon.dto.request.login;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignUpRequest {
    private Long userId;

    private String userName;

    private String userPw;

    private String userEmail;

    private String userNickname;

    private String userPhone;

    private String userProfile;

    private long role;

    private long activateStatus;

}
