package com.tns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.ShopOwner;
import com.tns.repository.ShopOwnerRepository;

@Service
public class ShopOwnerService {

@Autowired	
private ShopOwnerRepository repo;
	
	public List<ShopOwner> listAll() {
		return repo.findAll();
	}
	
	public ShopOwner save(ShopOwner ShopOwner) {
		repo.save(ShopOwner);
		return ShopOwner;
	}
	
	public ShopOwner get(Long id) {
		return repo.findById(id).get();
		
	}

	public void delete(Long id) 
	 {
	repo.deleteById(id);
	 
	}
}

