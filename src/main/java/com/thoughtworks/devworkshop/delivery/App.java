package com.thoughtworks.devworkshop.delivery;

import java.util.Arrays;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<Product> products = Arrays.asList(
        new Table(),
        new Song());

    for (Product product: products) {
      System.out.println(product.getDescription());
      System.out.println(product.getDimension());
    }

  }
}
