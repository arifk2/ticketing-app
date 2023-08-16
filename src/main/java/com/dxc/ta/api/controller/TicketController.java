package com.dxc.ta.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.ta.api.model.Ticket;
import com.dxc.ta.api.service.TicketService;

@RestController
@RequestMapping("/api/")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@PostMapping("create")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		return ticketService.saveTicket(ticket);
	}

	@GetMapping
	public List<Ticket> getAllTicket() {
		return ticketService.getAllTicket();
	}

	@GetMapping("{id}")
	public Ticket getTicketById(@PathVariable int id) {
		return ticketService.getTicketById(id);
	}

}
