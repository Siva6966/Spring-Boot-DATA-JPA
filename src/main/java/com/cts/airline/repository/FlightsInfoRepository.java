package com.cts.airline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.airline.entity.FlightsInfo;

@Repository
public interface FlightsInfoRepository extends JpaRepository<FlightsInfo, Long> {
}
