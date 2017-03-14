package com.galvanize;

import java.util.List;

public class Business implements Addressable {
	final String name;
	final List<Address> addresses;
	
	public Business(String name) {
		this.name = name;
		this.addresses = null;
	}
	
	public String getName() {
		return name;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void addAddress(Address address) {
		addresses.add(address);
	}
}