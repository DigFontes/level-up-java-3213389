package com.linkedin.javaobjectorientedprogramming.tree;

public class Main {

  public static void main(String[] args) {
    Tree  mapleTree = new Tree(120, 12, TreeType.MAPLE);
    System.out.println(mapleTree);
    mapleTree.announceTallTree();

    Tree oakTree = new Tree(90, 30, TreeType.OAK);
    System.out.println(oakTree);
    oakTree.announceTallTree();

    System.out.println(Tree.TRUNK_COLOR);
    Tree.announceTree();
    

  }
  
}
