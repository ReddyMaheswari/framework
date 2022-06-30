package restapi.framework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restapi.framework.model.Person;
import restapi.framework.repository.PersonRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RequestMapping("api")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/getperson")
	public List<Person> getAllPersons(){
		return personRepository.findAll();
	}
	@PostMapping("/addperson")
	public Person addPerson(@RequestBody Person p) {
		personRepository.save(p);
		return p;
	}

}
