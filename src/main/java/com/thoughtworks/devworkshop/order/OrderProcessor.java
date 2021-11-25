package com.thoughtworks.devworkshop.order;

public class OrderProcessor {
  boolean isOnlineOrder;

  public OrderProcessor(boolean isOnlineOrder) {
    this.isOnlineOrder = isOnlineOrder;
  }

  public void process(boolean isGiftWrap) {
    if (isOnlineOrder) {
      System.out.println("1. Processing online order");
      System.out.println("2. Process payment online");
      if (isGiftWrap) {
        System.out.println("2.1 Gift wrapped");
      }
      System.out.println("3. Ship items to delivery address");

    } else {
      System.out.println("1. Processing store order");
      System.out.println("2. Collect payment from customer");
      if (isGiftWrap) {
        System.out.println("2.1 Gift wrapped");
      }
      System.out.println("3. Handover items to the customer");
    }


  }



}
