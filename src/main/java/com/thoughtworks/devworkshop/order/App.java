package com.thoughtworks.devworkshop.order;

public class App {
  public static void main(String[] args) {
    OrderProcessor onlineOrder = new OrderProcessor(true);
    onlineOrder.process(true);

    System.out.println();
    OrderProcessor storeOrder = new OrderProcessor(false);
    storeOrder.process(true);
  }
}
