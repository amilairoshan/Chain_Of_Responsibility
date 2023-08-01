package com.example.ChainOfResponsibilityDemo;



import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainOfResponsibilityDemoApplication {

	
	 
	public static void main(String[] args) {
		SpringApplication.run(ChainOfResponsibilityDemoApplication.class, args);
		
		InitiateHandler initiate=new InitiateHandler();
		BOCHandler boc=new BOCHandler();
		PeoplesBankHandler peoples=new PeoplesBankHandler();
		HNBHandler hnb=new HNBHandler();
		CommercialBankHandler com=new CommercialBankHandler();
		
		initiate.setHandler(boc);
		boc.setHandler(peoples);
		peoples.setHandler(hnb);
		hnb.setHandler(com);
		
		traceDepositInfo(initiate.calculateFixedDeposit(new FixedDeposit(Bank.BOC, 5, BigDecimal.valueOf(100))));	
		
	}

	public static void traceDepositInfo(FixedDeposit fixedDeposit) {
		System.out.printf("The %s Bank interest is :  %.2f for given amount : %.2f%n", fixedDeposit.getBank(),fixedDeposit.getInterest(),fixedDeposit.getAmount() );
	}
	
	

}
