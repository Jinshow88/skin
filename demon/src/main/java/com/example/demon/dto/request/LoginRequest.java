package com.example.demon.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

    private Long userId;

    private String userName;

    private String userPw;

    private String userEmail;

    private String userNickname;

    private String userPhone;

    private String userProfile;

    private long role;

    private long activateStatus;

// ----------------------------------------------------------//

    private Long ownerId;

    private String businessNumber;

    private String businessPaper;

    private long glampingStatus;


}
