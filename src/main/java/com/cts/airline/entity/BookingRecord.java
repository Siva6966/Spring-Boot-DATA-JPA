package com.cts.airline.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "booking_record")
public class BookingRecord {

    @Id
    private Long bookingId;

    private LocalDateTime bookingDate;

    private String destination;

    private Double fare;

    private LocalDate flightDate;

    private String flightNumber;

    private LocalTime flightTime;

    private String origin;

    private String status;
}
