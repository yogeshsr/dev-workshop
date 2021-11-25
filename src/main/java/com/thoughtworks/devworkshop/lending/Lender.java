package com.thoughtworks.devworkshop.lending;

public class Lender extends Person {
  Double amount;

  public Lender(String name, Double amount) {
    super(name);
    this.amount = amount;
  }

  public void lend(Double amount, Borrower borrower) {
    this.amount -= amount;
    borrower.borrow(amount);
  }

  public void receive(Double amount) {
    this.amount += amount;
  }

  @Override
  public String toString() {
    return "Lender{" +
        "amount=" + amount +
        ", name='" + name + '\'' +
        '}';
  }
}
