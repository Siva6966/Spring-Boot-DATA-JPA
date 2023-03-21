package com.cts.airline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.airline.entity.AirlineInfo;

@Repository
public interface AirlineInfoRepository extends JpaRepository<AirlineInfo, Long> {
}
