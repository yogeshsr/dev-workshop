package com.thoughtworks.devworkshop.lending;

public class Borrower extends Person {
  Double amount;

  public Borrower(String name, Double amount) {
    super(name);
    this.amount = amount;
  }

  public void borrow(Double amount) {
    this.amount += amount;
  }

  public void payBack(Double amount, Lender lender) {
    Double interest = 0.04;
    Double amountToBePaid = amount * (1 + interest);
    this.amount -= amountToBePaid;
    lender.receive(amountToBePaid);
  }

  @Override
  public String toString() {
    return "Borrower{" +
        "amount=" + amount +
        ", name='" + name + '\'' +
        '}';
  }
}
