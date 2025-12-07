package com.example.demon.dto.objest.owner;

import com.example.demon.entity.GlampingEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GlampingPostObjest {

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

    private Long reviewCount;

    private Double starPointAvg;

    private String traffic;

    public static GlampingPostObjest fromEntity(GlampingEntity entity) {
        GlampingPostObjest dto = new GlampingPostObjest();

        dto.setGlampId(entity.getGlampId());
        dto.setOwnerId(entity.getOwner().getOwnerId()); // ✅ ownerId 매핑
        dto.setGlampImage(entity.getGlampImage());
        dto.setGlampName(entity.getGlampName());
        dto.setGlampCall(entity.getGlampCall());
        dto.setGlampIntro(entity.getGlampIntro());
        dto.setGlampLocation(entity.getGlampLocation());
        dto.setActivateStatus(entity.getActivateStatus());
        dto.setExtraCharge(entity.getExtraCharge());
        dto.setInfoBasic(entity.getInfoBasic());
        dto.setInfoNotice(entity.getInfoNotice());
        dto.setRecommendScore(entity.getRecommendScore());
        dto.setRegion(entity.getRegion());
        dto.setReviewCount(entity.getReviewCount());
        dto.setStarPointAvg(entity.getStarPointAvg()); // ✅ 이름만 다름
        dto.setTraffic(entity.getTraffic());

        return dto;
    }
}
