package com.bank.application;

import com.bank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
	}

	public void withdrawM(float accBal) {
		System.out.println("Dear customer , Your Account Balance is : "+accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	
}
