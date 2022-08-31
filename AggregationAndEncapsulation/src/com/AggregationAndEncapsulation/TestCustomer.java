package com.AggregationAndEncapsulation;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// task1
		Customer c1 = new Customer();
		c1.setCustomerName("john");
		Address add1 = new Address("Ist Main HSR Layout","Bangalore");
		c1.setResidentialAddress(add1);
		System.out.println(c1.getCustomerName());
		System.out.println(c1.getResidentialAddress().getAddressLine() + ", " + c1.getResidentialAddress().getCity());
		
		// task2
		Address add2 = new Address("HNO 59 Ishwar Nagar", " Bhopal");
		Customer c2 = new Customer("raikwar",add2);
		System.out.println(c2.getCustomerDetails());
	}

}
