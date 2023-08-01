package com.example.ChainOfResponsibilityDemo;

import java.math.BigDecimal;

public abstract class Handler {

	public Handler handler;

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	public abstract FixedDeposit calculateFixedDeposit(FixedDeposit fixedDeposit);

}
