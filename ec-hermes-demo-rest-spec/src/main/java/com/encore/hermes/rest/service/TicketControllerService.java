package com.encore.hermes.rest.service;

import java.util.List;

import com.encore.hermes.rest.data.Ticket;
import com.encore.hermes.rest.exception.TicketNotFoundException;

public interface TicketControllerService {

	public void book(Ticket ticket);

	public void cancelTicket(Long reservationNimber) throws TicketNotFoundException;

	public List<Ticket> availableTickets();

}
