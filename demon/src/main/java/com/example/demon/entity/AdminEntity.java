package com.example.demon.entity;

import com.example.demon.common.Role;

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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "admin")
@Entity
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("관리자 PK")
    private Long adminIdx;

    @Column(length = 50, nullable = false, unique = true)
    @Comment("관리자 ID")
    private String adminId;

    @Column(length = 70, nullable = false)
    @Comment("관리자 패스워드")
    private String adminPw;

    @Column(length = 50, nullable = false)
    @Comment("관리자 이름")
    private String adminName;

    @Column(length = 22)
    @Comment("휴대폰 번호")
    private String adminPhone;

    @Column(nullable = false)
    @Comment("유저 권한")
    // @Convert(converter = RoleConverter.class)
    private Role role;
}
