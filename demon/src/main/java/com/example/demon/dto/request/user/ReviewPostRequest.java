package com.example.demon.dto.request.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewPostRequest {

    private Long userId;

    private Long glampId;

    private Long reservationId;

    private String reviewContent;

    private Integer reviewStarPoint;

    // private String reviewComment;

    
}
