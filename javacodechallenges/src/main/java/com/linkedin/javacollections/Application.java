package com.linkedin.javacollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Application {
  public static void main(String[] args) {
    Room cambridge = new Room("Cambridge", "Primiere Room", 4, 175.00);
    Room manchester = new Room("Manchester", "Suite", 5, 250.0);
    Room piccadilly = new Room("Piccadilly", "Guest Room", 35, 125.0);
    Room oxford = new Room("Oxford", "Suit", 5, 225.0);

    Collection<Room> rooms = List.of(cambridge, manchester, piccadilly, oxford);
    
    // double total = getPotentialRevenue(cambridge, manchester, piccadilly, oxford);

    // Room[] rooms = new Room[2];
    // rooms[0] = cambridge;
    // rooms[1] = manchester;
    // rooms[2] = piccadilly;


    double total = getPotentialRevenue(rooms);
    System.out.println(total);
  }

  private static double getPotentialRevenue(Collection<Room> rooms) {
    return rooms.stream()
            .mapToDouble(r -> r.getRate())
            .sum();
  }
}
