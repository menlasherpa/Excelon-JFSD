package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<Customer> save(@RequestBody Customer customer) {
		Customer newCustomer = customerService.save(customer);
		return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer customer) {
		Customer updatedCustomer = customerService.update(customer, id);
		return updatedCustomer != null ?
				new ResponseEntity<>(updatedCustomer, HttpStatus.OK) :
				new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> selectOne(@PathVariable Long id) {
		Optional<Customer> customer = customerService.selectOne(id);
		return customer.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping
	public List<Customer> selectAll() {
		return customerService.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteOne(@PathVariable Long id) {
		customerService.delete(id);
	}
	
	@DeleteMapping
	public void deleteAll() {
		customerService.deleteAll();
	}
	

}
