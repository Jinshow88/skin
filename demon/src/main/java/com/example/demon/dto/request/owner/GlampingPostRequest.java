package com.example.demon.dto.request.owner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GlampingPostRequest {

    private Long glampId;
    
    private Long ownerId;

    private String glampImage;

    private String glampName;

    private String glampCall;

    private String glampIntro;

    private String glampLocation;

    private Integer activateStatus;

    private Integer extraCharge;

    private String infoBasic;

    private String infoNotice;

    private Double recommendScore;

    private String region;
    
    private Integer reviewCount;

    private Double starPointAng;

    private String traffic;
}
