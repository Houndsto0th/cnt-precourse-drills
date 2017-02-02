package com.galvanize;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Business implements Addressable {
  private String name;
  private List<Address> addresses;

  public Business(String currentName) {
    name = currentName;
    addresses = new ArrayList<>();
  } 

  public String getName() {
    return name;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void addAddress(Address newAddress) {
    addresses.add(newAddress);
  }
}