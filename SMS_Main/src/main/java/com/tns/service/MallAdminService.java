package com.tns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.MallAdmin;
import com.tns.repository.MallAdminRepository;

@Service
public class MallAdminService {

@Autowired	
private MallAdminRepository repo;
	
	public List<MallAdmin> listAll() {
		return repo.findAll();
	}
	
	public MallAdmin save(MallAdmin MallAdmin) {
		repo.save(MallAdmin);
		return MallAdmin;
	}
	
	public MallAdmin get(Long id) {
		return repo.findById(id).get();
		
	}

	public void delete(Long id) 
	 {
	repo.deleteById(id);
	 
	}
}

