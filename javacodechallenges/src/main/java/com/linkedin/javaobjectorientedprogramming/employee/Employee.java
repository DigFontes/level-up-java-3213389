package com.linkedin.javaobjectorientedprogramming.employee;

public class Employee {

  private String name;
  private int age;
  private double salary;
  private String location; 

  public Employee(String name,  int age, double salary, String location) {

    this.name = name;
    this.age = age;
    this.salary = salary;
    this.location = location;

  }

  public void raiseSalary() {
    double raise = raise();
    this.salary = this.salary + raise;
    this.announceRaise(raise);
  }

  static double raise() {
    return 200;
  }

  private void announceRaise(double raise){
    System.out.println(
        "Congrats, "+ this.getName() + "!" + "You've earned a raise on your salary." +
            "The value of the raise is: $" + raise);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

}
