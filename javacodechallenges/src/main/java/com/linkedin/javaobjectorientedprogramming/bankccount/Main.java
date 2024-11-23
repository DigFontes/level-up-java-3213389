package com.linkedin.javaobjectorientedprogramming.bankccount;

public class Main {
  public static void main(String[] args) {
    BankAccount bankAccount1 = new BankAccount("Diêgo", 0);
    bankAccount1.deposit(14500.00);
    bankAccount1.withdraw(4578.00);
  }
}
