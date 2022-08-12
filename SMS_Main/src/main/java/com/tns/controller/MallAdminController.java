package com.tns.controller;

import java.util.List;


import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tns.entity.MallAdmin;
import com.tns.service.MallAdminService;

public class MallAdminController {

	@Autowired
	private MallAdminService service;
	@GetMapping("/malladmin")
	 public List<MallAdmin> list() 
	 {
	 return service.listAll();
	 }
	 @GetMapping("/malladmin/{id}")
	 public ResponseEntity<MallAdmin> get(@PathVariable Long id) 
	 {
	 try
	 {
		 MallAdmin MallAdmin = service.get(id);
	 return new ResponseEntity<MallAdmin>(MallAdmin, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<MallAdmin>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Create operation
	 @PostMapping("/malladmin")
	 public void add(@RequestBody MallAdmin MallAdmin) 
	 {
	
	service.save(MallAdmin);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/malladmin/{id}")
	 public ResponseEntity<?> update(@RequestBody MallAdmin MallAdmin, @PathVariable Long id) 
	 {
	 try
	 {
		 
	 service.save(MallAdmin);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/malladmin/{id}")
	 public void delete(@PathVariable Long id) 
	 {
	 service.delete(id);
	 }
}
