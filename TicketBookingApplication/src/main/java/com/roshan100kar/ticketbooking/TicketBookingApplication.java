package com.roshan100kar.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roshan100kar.ticketbooking.model.Ticket;
import com.roshan100kar.ticketbooking.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner{

	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



		Ticket ticket=new Ticket();
		ticket.setPassengerName("roshan");
		ticket.setSourceStation("london");
		ticket.setDestination_station("Delhi");
		ticket.setTravelDate(new Date());
		ticket.setEmail("ramu@gmail.com");

		ticketService.createTicket(ticket);

	}

}
