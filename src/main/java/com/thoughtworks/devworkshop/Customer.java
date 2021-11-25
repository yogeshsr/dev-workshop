package com.thoughtworks.devworkshop;

import java.util.List;

public class Customer {
  String name;
  List<Rental> rentals;

  public Customer(String name, List<Rental> rentals) {
    this.name = name;
    this.rentals = rentals;
  }

  public String statement() {
    String result = name + ", ";
    int amount = 0;
    for(Rental each: rentals) {
      double thisAmount = 0;
      //determine amounts for each line
      switch (each.getMovie().getPriceCode()) {
        case Movie.REGULAR:
          thisAmount += 3;
          break;
        case Movie.NEW_RELEASE:
          thisAmount += 4;
          break;
        case Movie.CHILDRENS:
          thisAmount += 2;
          break;
      }
      amount += each.getDaysRented() * thisAmount;
      result += String.format("Title: %s, Rented days: %s, Rental: %s\n",
          each.getMovie().getTitle(),
          each.getDaysRented(),
          amount);
    }

    return result + "Total: " + amount;
  }

}
