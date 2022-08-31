package com.AggregationAndEncapsulation2;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// task1
		Address resAdd = new Address("Ist Main HSR Layout", "Bangalore");
		Address offAdd = new Address("Ist Main Electronics city", "Bangalore");
		Customer c1 = new Customer("John",resAdd,offAdd);
		System.out.println(c1.getCustomerDetails());
	}

}
