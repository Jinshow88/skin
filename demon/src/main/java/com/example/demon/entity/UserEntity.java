package com.example.demon.entity;

import com.example.demon.common.Role;

import org.hibernate.annotations.Comment;

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
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("유저ID")
    private Long userId;

    private String userEmail;

    private String userPw;

    private String userName;

    private String userPhone;

    private String userProfile;

    private Role role;

    private Long activateStatus;
}
