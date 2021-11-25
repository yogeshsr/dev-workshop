package com.thoughtworks.devworkshop.delivery;


public class Song implements Product{

  @Override
  public String getDescription() {
    return "Song description";
  }

  @Override
  public String getDimension() {
    throw new UnsupportedOperationException("Song don't support dimension");
  }
}
