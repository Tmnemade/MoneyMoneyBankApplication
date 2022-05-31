package com.bank.customer;

import com.bank.application.MMBankFactory;
import com.bank.application.MMCurrentAcc;
import com.bank.application.MMSavingAcc;
import com.bank.framework.BankFactory;
import com.bank.framework.CurrentAcc;
import com.bank.framework.SavingAcc;

public class Customer {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory bankf =new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(7896325, "Rahul", 500000, true);
		sa.withdrawM(sa.getAccBal());
		sa.toString();
		CurrentAcc ca = new MMCurrentAcc(849111, "Vaishali",500000, 20000);
		ca.withdrawM(ca.getCreditLimit());
		ca.toString();
		
	}

}
