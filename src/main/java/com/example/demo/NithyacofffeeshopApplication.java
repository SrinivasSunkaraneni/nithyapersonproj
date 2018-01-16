package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NithyacofffeeshopApplication implements CommandLineRunner{

	@Autowired
	PersonRepository personRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NithyacofffeeshopApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setFirstName("Gopi");
		person.setLastName("Kota");
		personRepository.save(person);
		person = new Person();
		person.setFirstName("Srini");
		person.setLastName("S");
		personRepository.save(person);
		person.setFirstName("Ronith");
		person.setLastName("Reddy");
		personRepository.save(person);
		
	}
	
	
}
