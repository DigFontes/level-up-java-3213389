package com.linkedin.javaobjectorientedprogramming.bankccount;

public class Main {
  public static void main(String[] args) {
    BankAccount bankAccount1 = new BankAccount("Diêgo", 0);
    bankAccount1.deposit(0.00);
    bankAccount1.withdraw(15000.00);
  }
}
