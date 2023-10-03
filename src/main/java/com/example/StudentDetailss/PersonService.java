package com.example.StudentDetailss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class PersonService {
 @Autowired
 PersonDao pd;

public String postAll(List<Person> p) {

	return pd.postAll(p);
}
public List<Person> getAll(){
	return pd.getAll();
}
public String update(Person p) {
	return pd.update(p);
}

public String deleteById(int id) {
	return pd.deleteById(id);
}
public String posts(Person p) throws AgeNotFoundException  {
	  if(p.getAge() <=18) {
		  throw new AgeNotFoundException("below 18");
	  }
	  else {
		  return pd.posts(p);
	  }
}
}



