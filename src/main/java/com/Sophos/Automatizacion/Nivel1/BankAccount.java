package com.Sophos.Automatizacion.Nivel1;

//El propósito del patrón Builder es simplificar la creación de objetos que se consideran complejos.

// Ej. Una clase que mantiene los datos de una cuenta bancaria

public class BankAccount {

	private long accountNumber;
	private String owner;
	private BankAccountType type;
	private double balance;
	private double interestRate;

	public BankAccount() {
	}

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

	public BankAccountType getType() {
		return type;
	}

	public void setType(BankAccountType type) {
		this.type = type;
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
