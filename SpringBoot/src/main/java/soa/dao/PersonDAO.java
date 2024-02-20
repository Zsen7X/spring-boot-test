package soa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soa.model.Person;
import soa.repository.PersonRepository;

@Service
public class PersonDAO {

	@Autowired
	private PersonRepository personRepository;

	public List<Person> findAll() {
		return (List<Person>) personRepository.findAll();
	}
	
	public Person findByID(int i) {
		return personRepository.findById(i).get();
	}

}
