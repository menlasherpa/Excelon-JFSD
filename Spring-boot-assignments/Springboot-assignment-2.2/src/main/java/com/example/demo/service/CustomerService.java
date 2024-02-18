package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Customer;

public interface CustomerService {
	
	public Customer save(Customer product);
	public Customer update(Customer customer, Long id);
	public Optional<Customer> selectOne(Long id);
	public List<Customer> selectAll();
	public void delete(Long id);
	public void deleteAll();
	
	

}
