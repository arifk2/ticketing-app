package com.dxc.ta.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.ta.api.model.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {
}
