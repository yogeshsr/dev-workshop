package com.thoughtworks.devworkshop.notification;

public class Notification {

  Emailer emailer;

  public Notification() {
    emailer = new Emailer();
  }

  public void send() {
    emailer.send();
  }
}
