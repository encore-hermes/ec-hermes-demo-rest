package com.encore.hermes.rest.exception;

public class TicketNotFoundException extends Exception {

	private static final long serialVersionUID = 5254740650388612484L;

	private static final String ERROR_MESSAGE = "Reservation %d does not exist";

	public TicketNotFoundException(Long id) {
		super(String.format(ERROR_MESSAGE, id));
	}


}
