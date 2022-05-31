package com.bank.application;

import com.bank.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	public void withdrawM(float creditLimit) {
		System.out.println("Dear User, Account Balance is : "+accBal+" with Credit Limit is: "+creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

	

}
