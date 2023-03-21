package com.cts.airline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.airline.entity.BookingRecord;

@Repository
public interface BookingRecordRepository extends JpaRepository<BookingRecord, Long> {
}
