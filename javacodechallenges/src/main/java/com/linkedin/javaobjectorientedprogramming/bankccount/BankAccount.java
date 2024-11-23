package com.linkedin.javaobjectorientedprogramming.bankccount;

public class BankAccount {
  private String owner;
  private double balance;

  public BankAccount(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;
  }

  public double withdraw(double withdrawValue) {
    this.balance = this.balance - withdrawValue;
    BankAccount.announceWithdraw(withdrawValue, this.balance);
    return this.balance;
  }

  public double deposit(double depositValue) {
    this.balance = this.balance + depositValue;
    BankAccount.announceDeposit(depositValue, this.balance);
    return this.balance;
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
