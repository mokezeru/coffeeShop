package edu.mum.coffee.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;
=======
>>>>>>> c74f1331a98d3473b47de3ec1d94ee87d1b4d4ae

import edu.mum.coffee.domain.Order;
import edu.mum.coffee.domain.Person;
import edu.mum.coffee.domain.Product;
<<<<<<< HEAD
import edu.mum.coffee.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	public List<User> findByUsername(String username);
=======

public interface UserRepository extends JpaRepository<Order, Integer>{
	
	List<Order> findDistinctOrderByOrderLines_Product(Product product);
	List<Order> findOrderByPerson(Person person);
	List<Order> findOrderByOrderDateBetween(Date minDate, Date maxDate);
>>>>>>> c74f1331a98d3473b47de3ec1d94ee87d1b4d4ae
	

}
