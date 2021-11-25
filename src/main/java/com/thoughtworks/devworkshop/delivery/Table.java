package com.thoughtworks.devworkshop.delivery;

public class Table implements Product{
  @Override
  public String getDescription() {
    return "Table details";
  }

  @Override
  public String getDimension() {
    return "10L x 10W x 10H";
  }
}
