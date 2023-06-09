package com.cts.airline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.airline.entity.FlightInfo;

@Repository
public interface FlightInfoRepository extends JpaRepository<FlightInfo, Long> {
}
