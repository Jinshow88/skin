package com.example.demon.dto.objest.owner;

import com.example.demon.entity.RoomEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomPostObjest {

    private Long roomId;

    private Long glampId;

    private String roomName;

    private Integer roomNumPeople;

    private Integer roomMaxPeople;

    private String checkInTime;

    private String checkOutTime;

    public static RoomPostObjest fromEntity(RoomEntity entity){
        RoomPostObjest dto = new RoomPostObjest();
        dto.setRoomId(entity.getRoomId());
        dto.setGlampId(entity.getGlampId().getGlampId());
        dto.setRoomName(entity.getRoomName());
        dto.setRoomNumPeople(entity.getRoomNumPeople());
        dto.setRoomMaxPeople(entity.getRoomMaxPeople());
        dto.setCheckInTime(entity.getCheckInTime());
        dto.setCheckOutTime(entity.getCheckOutTime());

        return dto;
    }
}
