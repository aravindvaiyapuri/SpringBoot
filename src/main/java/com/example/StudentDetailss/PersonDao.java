package com.example.StudentDetailss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class PersonDao {
@Autowired
PersonRepo pr;
public String postAll(List<Person> p)  {
	pr.saveAll(p);
	return "Data saved";
}
public List<Person> getAll() {
	return pr.findAll();
}
public String update(Person p) {
	pr.save(p);
	return "updated";
}
public String deleteById(int id) {
	pr.deleteById(id);
	return "data deleted";
}
public String posts(Person p) throws AgeNotFoundException {
	pr.save(p);
	return "saved";
}
}
