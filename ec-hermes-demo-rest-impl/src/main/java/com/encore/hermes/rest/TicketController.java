package com.encore.hermes.rest;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.encore.hermes.rest.data.Ticket;
import com.encore.hermes.rest.exception.TicketNotFoundException;
import com.encore.hermes.rest.service.TicketControllerService;

@Controller
public class TicketController implements TicketControllerService {

	private static final Logger logger = LoggerFactory.getLogger(TicketController.class);

	@RequestMapping(value = "/book", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = { MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	@Override
	public void book(@RequestBody Ticket ticket) {
		// TODO Auto-generated method stub
	}


	@RequestMapping(value = "/cancel/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	@Override
	public void cancelTicket(@PathVariable("id") Long reservationNimber) throws TicketNotFoundException {
		// TODO Auto-generated method stub
	}

	
	
	
	
	@RequestMapping(value = "/tickets", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	@Override
	public List<Ticket> availableTickets() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

}
