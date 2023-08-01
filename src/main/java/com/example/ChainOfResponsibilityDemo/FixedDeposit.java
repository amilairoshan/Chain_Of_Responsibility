package com.example.ChainOfResponsibilityDemo;

import java.math.BigDecimal;

public class FixedDeposit {

	private Bank bank;
	private int period;
	private BigDecimal amount;
	private BigDecimal interest;
	private BigDecimal fullAmount;
	
	public FixedDeposit(Bank bank, int period, BigDecimal amount) {
		super();
		this.bank = bank;
		this.period = period;
		this.amount = amount;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getFullAmount() {
		return fullAmount;
	}

	public void setFullAmount(BigDecimal fullAmount) {
		this.fullAmount = fullAmount;
	}

	@Override
	public String toString() {
		return "FixedDeposit [bank=" + bank + ", period=" + period + ", amount=" + amount + ", interest=" + interest
				+ ", fullAmount=" + fullAmount + "]";
	}

	
	
	
	
	
	
	
	
	
}
