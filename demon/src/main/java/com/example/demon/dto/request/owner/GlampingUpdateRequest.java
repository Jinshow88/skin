package com.example.demon.dto.request.owner;

import org.hibernate.annotations.Comment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GlampingUpdateRequest {

    private Long glampId;

    private Long ownerId;

    private String glampName;

    private String glampCall;

    private String glampImage;


    private Double starPointAvg;

    private Long reviewCount;

    private String glampLocation;

    private String region;

    @Comment("추가 인원당 요금")
    private Integer extraCharge;

    @Schema(description = "소개")
    private String glampIntro;
    @Schema(description = "기본정보")
    private String infoBasic;

    @Schema(description = "유의사항")
    private String infoNotice;
    @Schema(description = "추가위치정보")
    private String traffic;
}
