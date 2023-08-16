package com.dxc.ta.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.ta.api.model.Ticket;
import com.dxc.ta.api.repo.TicketRepo;

@Service
public class TicketService {

	@Autowired
	private TicketRepo ticketRepo;

	public Ticket saveTicket(Ticket ticket) {
		return ticketRepo.save(ticket);
	}

	public List<Ticket> getAllTicket() {
		return ticketRepo.findAll();
	}

	public Ticket getTicketById(int id) {
		return ticketRepo.findById(id).get();
	}
}
