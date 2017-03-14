package com.galvanize;

import java.io.*;

public class Address {
  private String street;
  private String city;
  private String state;
  private String zip;
  public Address(String street_name, String city_name, String state_name, String zip_code) {
    this.street = street_name;
    this.city = city_name;
    this.state = state_name;
    this.zip = zip_code;
  }

  public void addAddress(String city_name, String state_name, String zip_code) {
    city = city_name;
    state = state_name;
    zip = zip_code;
  }

  public String getStreet() {
    return street;
  }

  public String getCity() {
      return city;
  }

  public String getState() {
      return state;
    }

  public String getZip() {
      return zip;
    }

  public void setStreet(String street_name) {
   this.street = street_name;
  }

  public void setCity(String city_name) {
    this.city = city_name;
  }

  public void setState(String state_name) {
    this.state = state_name;
  }

  public void setZip(String zip_code) {
    this.zip = zip_code;
  }

  public String toString() {
    String result;
    result = street + ", " + city + ", " + state + " "+ zip;
    System.out.println(result);
    return result;
  }

  public static void main(String []args) {
    Address address = new Address("15 Main St","Cleveland", "OH", "44101");
    address.setStreet("15 Main St");
    address.setCity("Cleveland");
    address.setState("OH");
    address.setZip("44101");
    address.getStreet();
    address.getCity();
    address.getState();
    address.getZip();
    address.toString();
  }
}