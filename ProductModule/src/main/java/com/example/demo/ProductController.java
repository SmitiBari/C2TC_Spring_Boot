package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
    @Autowired
	private ProductService service;      //reference variable
	
    //Restful API methods for Retrieval operations
	@GetMapping("/products")
	public List<Product> list()
	{
		return service.listAll();
	}
	
	//Retrieval on the basis of id
	@GetMapping("/products/(id)")
	public ResponseEntity<Product> get(@PathVariable Integer id)
	{
		try {
			
			Product product = service.get(id);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}
	//Restful API methods for create operations
	@PostMapping("/products")
	public void add(@RequestBody Product product)
	{
		service.save(product);
	}
 
	//Restful API methods for Update operations
	@PutMapping("/products/(id)")
	public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id)
	{
		try {
			Product existProduct = service.get(id);
			service.save(product);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Restful API methods for Delete operations
	@DeleteMapping("/products/(id)")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
}
