package com.Sophos.Automatizacion.Nivel1.PatronBuilder;

public class BankAccount {

	//Definicion de variables
	
	private long accountNumber;
	private String owner;
	private double balance;
	private double interestRate;

	//Definición de constructor
	public BankAccount() {
	}

	//Definición métodos getters and setters
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}


//El propósito del patrón Builder es simplificar la creación de objetos que se consideran complejos.

//Ej. Una clase que mantiene los datos de una cuenta bancaria
