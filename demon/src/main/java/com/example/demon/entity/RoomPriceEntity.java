package com.example.demon.entity;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "room_price")
@ToString
public class RoomPriceEntity extends CreatedAt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("가격 PK")
    private Long roomPriceId;

    @OneToOne
    @JoinColumn(name = "room_id", nullable = false, unique = true)
    @Comment("객실 ID")
    private RoomEntity room;

    @Column(nullable = false)
    @Comment("비수기 주중 가격")
    private Integer weekdayPrice;

    @Column(nullable = false)
    @Comment("비수기 주말 가격")
    private Integer weekendPrice;

    @Column(nullable = false)
    @Comment("성수기 주중 가격")
    private Integer peakWeekdayPrice;

    @Column(nullable = false)
    @Comment("성수기 주말 가격")
    private Integer peakWeekendPrice;

    // @Column(nullable = false) @Comment("성수기 시작")
    // private LocalDate startPeakDay;
    //
    // @Column(nullable = false) @Comment("성수기 끝")
    // private LocalDate endPeakDay;

}
