package com.cts.airline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity(name = "passenger")
public class Passenger {

	@Id
    @Column(name = "passenger_id")
    private Long passengerId;
    
    @Column(name = "email_address")
    private String emailAddress;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "mobile_number")
    private Long mobileNumber;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id")
    private BookingRecord bookingRecord;
}
