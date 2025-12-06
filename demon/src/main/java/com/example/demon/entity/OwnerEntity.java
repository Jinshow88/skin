package com.example.demon.entity;

import com.example.demon.common.Role;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Owner")
public class OwnerEntity extends UpdatedAt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("사업자 유저 ID")
    private Long ownerId;

    @Column(length = 12, nullable = false, unique = true)
    @Comment("사업자 등록 번호")
    private String businessNumber;

    @Column(length = 50, nullable = false, unique = true)
    @Comment("사장님 이메일")
    private String ownerEmail;

    @Column(length = 70, nullable = false)
    @Comment("사장님 비밀번호")
    private String ownerPw;

    @Column(length = 50, nullable = false)
    @Comment("대표자명")
    private String ownerName;

    @Column(length = 11)
    @Comment("대표자 전화번호")
    private String ownerPhone;

    @Column(length = 20, nullable = false)
    @Comment("권한")
    // @Convert(converter = RoleConverter.class)
    private Role role;

    @Column(nullable = false)
    @ColumnDefault("1")
    @Comment("회원 탈퇴 시 -1")
    private Integer activateStatus;

    @Column(length = 100)
    @Comment("사업자 등록증")
    private String businessPaperImage;

    @Column(nullable = false)
    @ColumnDefault("1")
    @Comment("글램핑 정상 등록 완료 = 1")
    private Integer glampingStatus;

}
