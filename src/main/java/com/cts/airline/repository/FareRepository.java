package com.cts.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.airline.entity.Fare;

@Repository
public interface FareRepository extends JpaRepository<Fare, Long> {
}
