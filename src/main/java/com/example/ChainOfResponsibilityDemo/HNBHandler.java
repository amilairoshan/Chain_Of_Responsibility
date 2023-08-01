package com.example.ChainOfResponsibilityDemo;

import java.math.BigDecimal;

public class HNBHandler extends Handler {

	@Override
	public FixedDeposit calculateFixedDeposit(FixedDeposit fixedDeposit) {
		if(fixedDeposit.getBank().equals(Bank.HNB)) {
			int period=fixedDeposit.getPeriod();
			BigDecimal amount=fixedDeposit.getAmount();
			if(period <=2) {
				fixedDeposit.setInterest(amount.multiply(BigDecimal.valueOf(.100)));
			}
			else if(period > 2 && period < 6) {
				fixedDeposit.setInterest(amount.multiply(BigDecimal.valueOf(.125)));
			}
			else if(period >=6 && period < 12) {
				fixedDeposit.setInterest(amount.multiply(BigDecimal.valueOf(.130)));
			}
			else {
				fixedDeposit.setInterest(amount.multiply(BigDecimal.valueOf(.130)));
			}
			fixedDeposit.setFullAmount(amount.add(fixedDeposit.getInterest()));
			return fixedDeposit ;
			
		}
		else {
			return handler.calculateFixedDeposit(fixedDeposit);
		}	
	}

}
