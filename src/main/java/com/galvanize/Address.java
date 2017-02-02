package com.galvanize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Address {
  private String street;
  private String city;
  private String state;
  private String zip;

  public Address(String currentStreet, String currentCity, String currentState, String currentZip) {
    street = currentStreet;
    city = currentCity;
    state = currentState;
    zip = currentZip;
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
  
  public void setStreet(String newStreet) {
    street = newStreet;
  }
  public void setCity(String newCity) {
    city = newCity;
  }
  public void setState(String newState) {
    state = newState;
  }
  public void setZip(String newZip) {
     zip = newZip;
  }

  @Override public String toString() {
    StringBuilder result = new StringBuilder();
    
    result.append(street + ", " + city + ", " + state + " " + zip);

    return result.toString(); 
  }
}