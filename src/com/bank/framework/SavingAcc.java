package com.bank.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalary;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	public void withdrawM(float accBal) {
		System.out.println("Remaining Account Balance is : "+accBal);
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isPrime=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
