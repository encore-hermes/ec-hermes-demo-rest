package com.encore.hermes.rest.data;

import java.math.BigDecimal;

public class Ticket {
	
	private TicketType type;
	private BigDecimal amount;
	public TicketType getType() {
		return type;
	}
	public void setType(TicketType type) {
		this.type = type;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
