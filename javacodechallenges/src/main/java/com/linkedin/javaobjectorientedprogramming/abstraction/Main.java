package com.linkedin.javaobjectorientedprogramming.abstraction;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("javacodechallenges/src/main/java/com/linkedin/javaobjectorientedprogramming/abstraction/file.txt");
    System.out.println(digitsOnlyFileReader.getPath());
    System.out.println(digitsOnlyFileReader.readFile());
    
  }
}
