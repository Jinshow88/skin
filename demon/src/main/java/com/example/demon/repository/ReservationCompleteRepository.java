package com.example.demon.repository;

import com.example.demon.entity.ReservationCompleteEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationCompleteRepository extends JpaRepository<ReservationCompleteEntity, Long> {

}
