package com.example.ChainOfResponsibilityDemo;

import java.math.BigDecimal;

public class BOCHandler extends Handler {

	@Override
	public FixedDeposit calculateFixedDeposit(FixedDeposit fixedDeposit) {
		
		if(fixedDeposit.getBank().equals(Bank.BOC)) {
			int period=fixedDeposit.getPeriod();
			BigDecimal amount=fixedDeposit.getAmount();
			if(period <=2) {
				fixedDeposit.setInterest(amount.multiply(BigDecimal.valueOf(.135)));
			}
			else if(period > 2 && period < 6) {
				fixedDeposit.setInterest(amount.multiply(BigDecimal.valueOf(.15)));
			}
			else if(period >=6 && period < 12) {
				fixedDeposit.setInterest(amount.multiply(BigDecimal.valueOf(.1475)));
			}
			else {
				fixedDeposit.setInterest(amount.multiply(BigDecimal.valueOf(.145)));
			}
			fixedDeposit.setFullAmount(amount.add(fixedDeposit.getInterest()));
			return fixedDeposit ;
			
		}
		else {
			return handler.calculateFixedDeposit(fixedDeposit);
		}	
		
	}

	
	
	
	
	
	
}
