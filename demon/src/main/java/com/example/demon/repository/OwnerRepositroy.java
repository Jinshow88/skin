package com.example.demon.repository;

import com.example.demon.entity.OwnerEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OwnerRepositroy extends JpaRepository<OwnerEntity, Long> {

}
