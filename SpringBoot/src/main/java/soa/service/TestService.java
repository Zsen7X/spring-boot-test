package soa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.dao.PersonDAO;
import soa.model.Person;

@RestController
@RequestMapping("/person")
public class TestService {
	@Autowired
	private PersonDAO personDAO;
	
	/*@GetMapping("/test")
	public String test() {
		return "test";
	}*/
	
	
	@GetMapping("/")
	public List<Person> findAll(){
		/*List<Person> persons = new ArrayList<Person>();
		Person p = new Person("Test555");
		persons.add(p);*/
		return personDAO.findAll();
	}
	
	@GetMapping("/{id}")
	public Person findByID(@PathVariable("id")int i) {
		
		/*List<Person> persons = new ArrayList<Person>();
		Person p = new Person(1,"Test") ;
		persons.add(p);*/
		return personDAO.findByID(i) ;
	}
}
