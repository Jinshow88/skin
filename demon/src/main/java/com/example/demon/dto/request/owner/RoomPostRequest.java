package com.example.demon.dto.request.owner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomPostRequest {
    
    private Long roomId;

    private Long glampId;

    private String roomName;

    private Integer roomNumPeople;

    private Integer roomMaxPeople;

    private String checkInTime;

    private String checkOutTime;

}
