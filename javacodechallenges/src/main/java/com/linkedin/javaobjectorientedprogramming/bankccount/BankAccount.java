package com.linkedin.javaobjectorientedprogramming.bankccount;

public class BankAccount {
  private String owner;
  private double balance;

  public BankAccount(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;
  }

  public double withdraw(double withdrawValue) {
    checkAccountBalance(withdrawValue, this.balance);
    return this.balance;
  }

  public double deposit(double depositValue) {
    this.balance = this.balance + depositValue;
    BankAccount.announceDeposit(depositValue, this.balance);
    return this.balance;
  }

  static double checkAccountBalance(double withdrawValue, double balance) {
    if (withdrawValue > balance && balance != 0) {
      System.out.printf(
        "%nSorry, we can't process your request! Your balance account is: $%s." 
        +"%nAdjust the ammount of your withdraw request.%n"
        +"The value you are requiring: $%s%n", balance, withdrawValue);  
    } else if (withdrawValue > balance && balance == 0) {
      System.out.printf(
        "%nSorry, you're balance accout is: $%s. "
        +"Make deposit to request any withdraw!%n", balance);
    } else {
      balance = balance - withdrawValue;
      BankAccount.announceWithdraw(withdrawValue, balance);
      return balance;
    }
    return balance;
  }

  static void announceWithdraw(double withdrawValue, double balance) {
      System.out.printf(
        "%nYour withdraw of $%s has been processed successfully. Your account balance is now: $%s%n", withdrawValue, balance
        );
  }

  static void announceDeposit(double depositValue, double balance) {
    System.out.printf(
      "%nYour deposit of $%s has been processed successfully. You account  balance is now: $%s%n", depositValue, balance
      );
  }
}
