package com.linkedin.javaobjectorientedprogramming;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    String name = "Kathryn";
    int nameLength = name.length();
    System.out.println(nameLength);

    Stack<Character> charStack = new Stack<>();

    charStack.push('c');
    charStack.push('a');
    charStack.push('t');

    System.out.println(charStack.pop());
    System.out.println(charStack.pop());
    System.out.println(charStack.pop());
    
  }
}
