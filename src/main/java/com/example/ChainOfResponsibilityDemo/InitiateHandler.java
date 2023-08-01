package com.example.ChainOfResponsibilityDemo;


public class InitiateHandler extends Handler {

	@Override
	public FixedDeposit calculateFixedDeposit(FixedDeposit fixedDeposit) {
		
		return handler.calculateFixedDeposit(fixedDeposit);
	}

}
