package com.example.StudentDetailss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class PersonController {
@Autowired
PersonService ps;

@PostMapping(value="/postAll")
public String postAll(@RequestBody List<Person> p) {
	return ps.postAll(p);

}
@GetMapping(value="/getAll")
public List<Person> getAll() {
	return ps.getAll();
}
@PutMapping(value="/update")
public String update(@RequestBody Person p)  {
    return ps.update(p);
}
@DeleteMapping(value="/delete/{id}")
public String deleteById(@PathVariable int id) {
	return ps.deleteById(id);
	
}
@PostMapping(value="/postsAll")
public String posts(@RequestBody Person p) throws AgeNotFoundException{
	return ps.posts(p);
}
}