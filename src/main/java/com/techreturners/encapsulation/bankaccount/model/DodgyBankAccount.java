package com.techreturners.encapsulation.bankaccount.model;

public class DodgyBankAccount {

    public String accountNumber; // use private final, once it is constructed, it should not be changed
    public int accountBalance; // use private to hidden the accountBalance
    public int rewardAmount = 50; // use private final, once it is constructed, it should not be changed

    public DodgyBankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    public void depositAmount(int amount) {
        accountBalance += amount;
        addReward();
    }

    public void getAccountBalance() {
        System.out.println("Your account balance is " + accountBalance);
    }

    public void debitAmount (int amount) {
        accountBalance -= amount;
    }

    public void addReward() {
        accountBalance += rewardAmount;
    }

}
