package com.linkedin.javaobjectorientedprogramming.tree;

public class Main {

  public static void main(String[] args) {
    Tree  mapleTree = new Tree(120, 12, TreeType.MAPLE);
    mapleTree.announceTallTree();

    Tree oakTree = new Tree(90, 30, TreeType.OAK);
    Tree.announceTree();

    System.out.println(Tree.TRUNK_COLOR);

    System.out.println(mapleTree.geTreeType());
    System.out.println(mapleTree.getHeighFt());
    System.out.println(mapleTree.getTrunkDiameterInches());

    mapleTree.grow();

    System.out.println(mapleTree.getHeighFt());

  }
  
}
