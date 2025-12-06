package com.example.demon.dto.request.login;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OwnerSignUpRequest {


    private String ownerName;

    private String ownerPw;

    private String ownerEmail;

    private String ownerPhone;

    private long role;

    private long activateStatus;

    private Long ownerId;

    private String businessNumber;

    private String businessPaper;

    private long glampingStatus;


}