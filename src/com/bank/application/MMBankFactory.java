package com.bank.application;

import com.bank.framework.BankFactory;
import com.bank.framework.CurrentAcc;
import com.bank.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		MMSavingAcc mmsaving = new MMSavingAcc(AccNo, accNm, charges, isPrime);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float charges, float deliveryCharge) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(AccNo, accNm, deliveryCharge, deliveryCharge);
		return mmcurrent;
	}

	
	

	

}
