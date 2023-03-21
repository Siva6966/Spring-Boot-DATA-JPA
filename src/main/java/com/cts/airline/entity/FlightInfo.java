package com.cts.airline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "flight_info")
public class FlightInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_infoid")
    private long id;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "flight_type")
    private String flightType;

    @Column(name = "numberof_seats")
    private Integer numberOfSeats;
	

}
