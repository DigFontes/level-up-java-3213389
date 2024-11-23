package com.linkedin.javaobjectorientedprogramming.employee;

public class Main {
  public static void main(String[] args) {
    Employee jonh = new Employee("Jonh", 4200.00,30, "Dallas");
    Employee sarah = new Employee("Sarah", 7000.00, 37, "New 'York'");

    System.out.println(
      "Those are the newest company employees:\n" 
      + jonh.getName() +"\n" 
      + sarah.getName() 
      + "\nPlease, give'em a warm welcome!");
    
    sarah.raiseSalary();  
  }
}
