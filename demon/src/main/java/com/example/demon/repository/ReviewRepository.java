package com.example.demon.repository;

import com.example.demon.entity.ReviewEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, Long>{



long countByGlampId_GlampId(Long glampId);
} 