package com.roshan100kar.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roshan100kar.ticketbooking.dao.TicketDao;
import com.roshan100kar.ticketbooking.model.Ticket;

@Service 
		
public class TicketService {

	@Autowired
	private TicketDao ticketDao;  

	public Iterable<Ticket> retrieveAllTickets(){
		return ticketDao.findAll();
	}
	public Ticket createTicket(Ticket ticketObj) {

		return ticketDao.save(ticketObj);

	}

	public Ticket getTicket(Integer ticketId) {

		return ticketDao.findById(ticketId).orElse(new Ticket());
	}

	public Ticket updateTicket(Integer ticketId,String newEmail) {
		Ticket dbTicketObj=getTicket(ticketId);
		dbTicketObj.setEmail(newEmail);
		return ticketDao.save(dbTicketObj);
	}

	public void deletTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
	}

}
