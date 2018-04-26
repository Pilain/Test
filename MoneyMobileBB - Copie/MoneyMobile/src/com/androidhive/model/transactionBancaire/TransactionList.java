package com.androidhive.model.transactionBancaire;

import java.util.ArrayList;

public class TransactionList {
	

	private ArrayList<ITransaction> listDesTransaction;
	
	public ArrayList<ITransaction> getListDesTransaction() {
		return listDesTransaction;
	}

	public void setListDesTransaction(ArrayList<ITransaction> listDesTransaction) {
		this.listDesTransaction = listDesTransaction;
	}

	public TransactionList(){
		listDesTransaction = new ArrayList<ITransaction>();
	}
	

}
