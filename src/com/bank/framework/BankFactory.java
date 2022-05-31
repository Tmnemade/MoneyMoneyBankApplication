package com.bank.framework;

public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalary);
	public abstract CurrentAcc getNewCurrentAccount(int AccNo, String accNm,float accBal,float creditLimit);


}
