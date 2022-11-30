package com.roshan100kar.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roshan100kar.ticketbooking.model.Ticket;
@Repository 
public interface TicketDao extends CrudRepository<Ticket, Integer> {
	
}
