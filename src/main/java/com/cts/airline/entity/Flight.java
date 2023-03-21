package com.cts.airline.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "flight")
public class Flight {
    
	@Id
    @Column(name = "id")
    private long id;

    @Column(name = "destination")
    private String destination;

    @Column(name = "duration")
    private String duration;

    @Column(name = "flight_date")
    private LocalDate flightDate;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "flight_time")
    private LocalTime flightTime;

    @Column(name = "origin")
    private String origin;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fare_id", nullable = false)
    private Fare fare;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "flight_infoid", nullable = false)
    private FlightInfo flightInfo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inv_id", nullable = false)
    private Inventory inventory;
}
