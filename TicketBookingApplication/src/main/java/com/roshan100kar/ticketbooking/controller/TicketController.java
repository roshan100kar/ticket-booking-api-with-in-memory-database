package com.roshan100kar.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roshan100kar.ticketbooking.model.Ticket;
import com.roshan100kar.ticketbooking.service.TicketService;

@RestController
@RequestMapping(value="/tickets") 


public class TicketController {

	@Autowired
	private TicketService ticketService;

	@PostMapping(value="/create") 
	public Ticket createTicket(@RequestBody Ticket ticketObj) {
		return ticketService.createTicket(ticketObj);
	}

	@GetMapping(value="/all")  
	public Iterable<Ticket> getAllTickets(){
		return ticketService.retrieveAllTickets();
	}
	@GetMapping(value="/{ticketId}")
	public Ticket getTicket(@PathVariable("ticketId") Integer ticketId) {
		return ticketService.getTicket(ticketId);
	}

	@PutMapping(value="/{ticketId}/{newEmail}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,
							   @PathVariable("newEmail") String newEmail){
		return ticketService.updateTicket(ticketId, newEmail);
	}

	@DeleteMapping(value="/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId")  Integer ticketId) {
		ticketService.deletTicket(ticketId);
	}

}
