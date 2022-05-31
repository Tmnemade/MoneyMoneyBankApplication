package com.bank.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit ;

	public float getCreditLimit() {
		return creditLimit ;
	}

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public void withdrawM(float creditLimit)
	{
		System.out.println("CreditLimit  is :"+creditLimit);
	}
	
	@Override
	public String toString() {
		return "CurrentAcc [CreditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}



}
