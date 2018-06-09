package edu.mum.coffee.controller;

import java.util.Collection;

import javax.annotation.Resource;
<<<<<<< HEAD
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
=======
>>>>>>> c74f1331a98d3473b47de3ec1d94ee87d1b4d4ae

import org.dom4j.util.UserDataAttribute;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.context.ServletContextAware;
=======
>>>>>>> c74f1331a98d3473b47de3ec1d94ee87d1b4d4ae

import edu.mum.coffee.domain.Person;
import edu.mum.coffee.service.PersonService;

@Controller
<<<<<<< HEAD
public class HomeController implements ServletContextAware {
	
	private ServletContext context;
	
=======
public class HomeController {
>>>>>>> c74f1331a98d3473b47de3ec1d94ee87d1b4d4ae
	@Resource
	private PersonService personService;

	@GetMapping({ "/", "/index", "/home" })
	public String homePage() {
		return "home";
	}

	@GetMapping({ "/secure" })
<<<<<<< HEAD
	public String securePage(@AuthenticationPrincipal final UserDetails userdetails, Model model,HttpSession session) {
=======
	public String securePage(@AuthenticationPrincipal final UserDetails userdetails, Model model) {
>>>>>>> c74f1331a98d3473b47de3ec1d94ee87d1b4d4ae
		
		// get user name here ...
		String username = userdetails.getUsername();
		Collection<? extends GrantedAuthority> roles = userdetails.getAuthorities();
		GrantedAuthority arole = roles.stream().findFirst().get();
		String role = arole.toString();
		System.out.println("Role: "+role);
		System.out.println("Username: "+username);
		
		
		//Get person object by email
		Person person = personService.findByEmail(username).get(0);
		model.addAttribute("person", person);
<<<<<<< HEAD
		session.setAttribute("person", person);
=======
>>>>>>> c74f1331a98d3473b47de3ec1d94ee87d1b4d4ae
		System.out.println("First Name: "+person.getFirstName());
				
		if (role.equals("ROLE_USER")) {
			return "user-page";
		} else {
			return "admin-page";
		}
	}
<<<<<<< HEAD

	@Override
	public void setServletContext(ServletContext servletContext) {
		// TODO Auto-generated method stub
		this.context = servletContext;
		
	}
=======
>>>>>>> c74f1331a98d3473b47de3ec1d94ee87d1b4d4ae
}
