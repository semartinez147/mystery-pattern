package edu.cnm.deepdive.mysterypattern.model;

import java.util.Random;

public class Agent extends Position {
//as a subclass, Agent can access public and protected elements of Position (set & get) but not the privates (actual fields of x and y)
  private static Random rng = new Random();

  public Agent(double x, double y) {
    super(x, y);
  }

  public void jump(Position[] vertices, double fraction) {
    Position target = vertices[rng.nextInt(vertices.length)];
    setX(getX() + (target.getX() - getX()) * fraction);
    setX(getY() + (target.getY() - getY()) * fraction);
  }

}
