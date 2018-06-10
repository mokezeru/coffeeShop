package edu.mum.coffee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.coffee.domain.Order;
import edu.mum.coffee.domain.Person;
import edu.mum.coffee.domain.Product;
import edu.mum.coffee.service.OrderService;
import edu.mum.coffee.service.PersonService;
import edu.mum.coffee.service.ProductService;

@RestController
@RequestMapping(value="/api")
public class ServiceController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/createProduct")
	public void createProductPOST( Product product) {
		
		//System.out.println(product.getProductName());
		
			Product p = new Product();
			p.setProductName(product.getProductName());
			p.setDescription(product.getDescription());
			p.setPrice(product.getPrice());
			p.setProductType(product.getProductType());
			
			System.out.println("in the Server side");
			System.out.println(product.getProductName());
			
			//productService.save(p);
			
			//return p;
	
	}
	
	
	@RequestMapping(value="/listProducts")
	@ResponseBody
	public List<Product> getProducts(){
		
		return productService.getAllProduct();
	}
	
	@RequestMapping(value="/listPersons")
	@ResponseBody
	public List<Person> getPersons(){
		
		return personService.getAllPerson();
	}
	
	@RequestMapping(value="/listOrders")
	@ResponseBody
	public List<Order> getOrders(){
		
		return orderService.findAll();
	}
}
