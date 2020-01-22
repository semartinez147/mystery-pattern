package edu.cnm.deepdive.mysterypattern.model;

public class Position {

  //private means it can't be seen outside this class
  private double x;
  private double y;

  public Position(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  //protected is only changeable by this class, subclass, or package
  protected void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  protected void setY(double y) {
    this.y = y;
  }

}
