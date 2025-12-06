package com.example.demon.entity;

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
@Table(name = "service")
public class ServiceEntity extends CreatedAt {
    // 서비스시설 테이블
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("서비스 ID")
    private Long serviceId;

    @Column(length = 20, nullable = false)
    @Comment("서비스 이름")
    private String serviceTitle;

}
