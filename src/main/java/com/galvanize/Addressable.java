package com.galvanize;

import java.util.List;

public interface Addressable {
	public List<Address> getAddresses();
	public static void addAddress(Address address){}
}
