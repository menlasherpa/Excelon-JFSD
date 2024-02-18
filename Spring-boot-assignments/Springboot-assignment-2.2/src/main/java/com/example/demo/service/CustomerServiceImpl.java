package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public Customer save(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public Customer update(Customer customer, Long id) {
		if (customerRepo.existsById(id)) {
			customer.setId(id);
			return customerRepo.save(customer);
		}
		return null;
	}

	@Override
	public Optional<Customer> selectOne(Long id) {
		return customerRepo.findById(id);
	}

	@Override
	public List<Customer> selectAll() {
		return customerRepo.findAll();
	}

	@Override
	public void delete(Long id) {
		customerRepo.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		customerRepo.deleteAll();
	}

}
