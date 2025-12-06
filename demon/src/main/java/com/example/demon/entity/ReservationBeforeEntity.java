package com.example.demon.entity;

import java.time.LocalDate;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservation_before")
public class ReservationBeforeEntity extends CreatedAt {
    // 예약 테이블
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("예약 ID")
    private Long reservationId;

    @Column(length = 13, nullable = false, unique = true)
    @Comment("예약 번호")
    private String bookId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @Comment("유저 ID")
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "glamp_id", nullable = false)
    @Comment("글램핑 ID")
    private GlampingEntity glamping;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    @Comment("객실 ID")
    private RoomEntity room;

    @Column(length = 10, nullable = false)
    @Comment("예약자 성함")
    private String inputName;

    @Column(length = 11, nullable = false)
    @Comment("예약 인원")
    private Integer personnel;

    @Column(nullable = false)
    @Comment("체크인 일자")
    private LocalDate checkInDate;

    @Column(nullable = false)
    @Comment("체크아웃 일자")
    private LocalDate checkOutDate;

    @Column(length = 10, nullable = false)
    @Comment("결제 수단")
    private String pg;

    @Column(length = 20, nullable = false)
    @Comment("최종 결제 가격")
    private Long payAmount;
}
