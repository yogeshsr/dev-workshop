package com.thoughtworks.devworkshop.movierental;

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
      int thisAmount = 0;
      //determine amounts for each line
      switch (each.getMovie().getPriceCode()) {
        case Movie.REGULAR:
          thisAmount += 3 * each.getDaysRented();
          break;
        case Movie.NEW_RELEASE:
          thisAmount += 4 * each.getDaysRented();
          break;
        case Movie.CHILDRENS:
          thisAmount += 2 * each.getDaysRented();
          break;
      }
      amount += thisAmount;
      result += String.format("Title: %s, Rented days: %s, Rental: %s\n",
          each.getMovie().getTitle(),
          each.getDaysRented(),
          thisAmount);
    }

    return result + "Total: " + amount;
  }

}
