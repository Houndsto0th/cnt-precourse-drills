package com.galvanize;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public interface Addressable {

    
    List<Address> getAddresses();

    void addAddress(Address address);

}