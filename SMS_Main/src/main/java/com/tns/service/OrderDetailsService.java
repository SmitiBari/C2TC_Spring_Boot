package com.tns.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.OrderDetails;
import com.tns.repository.OrderDetailsRepository;
@Service
@Transactional
public class OrderDetailsService 
{
 @Autowired
 private OrderDetailsRepository repo;
 
 public List<OrderDetails> listAll() 
 {
 return repo.findAll();
 }
 
 public void save(OrderDetails order) 
 {
 repo.save(order);
 }
 
 public OrderDetails get(Integer id) 
 {
 return repo.findById(id).get();
 }
 
 public void delete(Integer id) 
 {
 repo.deleteById(id);
 }
}
