package com.linkedin.javaobjectorientedprogramming.employee;

public class Salesperson extends Employee{

  private double commissionPercentage;

  public Salesperson(String name, double salary, int age, double commissionPercentage) {
    super(name, salary, age);
    this.commissionPercentage = commissionPercentage;
  }

  public double getComissionPercentage() {
    return this.commissionPercentage;
  }

  public void raiseCommission() {
    if (this.commissionPercentage < .30) {
      this.commissionPercentage = 
            this.commissionPercentage * 1.2;
    }
  }
  
}
