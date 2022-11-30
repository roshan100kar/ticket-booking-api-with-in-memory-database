package com.roshan100kar.ticketbooking.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tbl_ticket") 
 						
public class Ticket {




	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="passenger_id")
	private Integer passengerId;


	
	@Column(name="passenger_name") 
	private String passengerName;


	@Column(name="source_station")
	private String sourceStation;


	@Column(name="destination_station")
	private String destination_station;



	@Column(name="travel_date")
	private Date travelDate;		




	private String email; 				


	public Integer getPassengerId() {
		return passengerId;
	}


	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}


	public String getPassengerName() {
		return passengerName;
	}


	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}


	public String getSourceStation() {
		return sourceStation;
	}


	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}


	public String getDestination_station() {
		return destination_station;
	}


	public void setDestination_station(String destination_station) {
		this.destination_station = destination_station;
	}


	public Date getTravelDate() {
		return travelDate;
	}


	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Ticket(String passengerName, String sourceStation, String destination_station,
			String email) {
		super();
		this.passengerName = passengerName;
		this.sourceStation = sourceStation;
		this.destination_station = destination_station;
		this.travelDate = new Date();
		this.email = email;
	}

	public Ticket() {}


	@Override
	public String toString() {
		return "Ticket [passengerId=" + passengerId + ", passengerName=" + passengerName + ", sourceStation="
				+ sourceStation + ", destination_station=" + destination_station + ", travelDate=" + travelDate
				+ ", email=" + email + "]";
	}








}
