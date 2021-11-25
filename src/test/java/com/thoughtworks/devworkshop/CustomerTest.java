package com.thoughtworks.devworkshop;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class CustomerTest {

  @Test
  public void emptyCustomerRentalDetailsWhenNoRentals() {
    Customer customer = new Customer("Some customer name", Collections.emptyList());

    String actualRentalDetail = customer.statement();

    assertEquals("Some customer name, Total: 0", actualRentalDetail);
  }

  @Test
  public void customerRentalDetailsForTheRentals() {
    Customer customer = new Customer("Some customer name", Arrays.asList(
        new Rental(1, new Movie("War", Movie.REGULAR)),
            new Rental(2, new Movie("Spider man", Movie.CHILDRENS)),
                new Rental(3, new Movie("Dummy", Movie.NEW_RELEASE))));

    String actualRentalDetail = customer.statement();

    assertEquals("Some customer name, Title: War, Rented days: 1, Rental: 3\n" +
        "Title: Spider man, Rented days: 2, Rental: 4\n" +
        "Title: Dummy, Rented days: 3, Rental: 12\n" +
        "Total: 19", actualRentalDetail);
  }
}