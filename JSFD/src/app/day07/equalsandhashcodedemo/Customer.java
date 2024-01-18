package app.day07.equalsandhashcodedemo;

import java.util.Objects;

public class Customer {
	
	private int custNo;
	private String name;
	private String address;
	
	// constructor
	public Customer(int custNo, String name, String address) {
		super();
		this.custNo = custNo;
		this.name = name;
		this.address = address;
	}

	// getters and setters
	public int getcustNo() {
		return custNo;
	}

	public void setcustNo(int custNo) {
		this.custNo = custNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	// equals and hashCode methods
	// written in order to display single record since we are using user defined objects in the list	
	// use with any of the data member
	@Override
	public int hashCode() {
		return Objects.hash(custNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return custNo == other.custNo;
	}
	

	// toString() method
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", name=" + name + ", address=" + address + "]";
	}

}
