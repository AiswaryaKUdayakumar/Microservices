package com.UST.Flightservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="passenger_info")
public class Passengerinfo {
    private Long pId;
    private String name;
    private String email;
    private String source;
    private String Destination;
    private Date travelDate;
    private String pickupTime;
    private String arrivalTime;
    private double fare;


}
