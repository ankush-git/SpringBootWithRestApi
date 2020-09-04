package in28min.helloWorld.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import in28min.helloWorld.user.Exception.UserNotFoundException;

@RestController
public class UserResource {

	@Autowired
	UserServiceDao userServiceDao;
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers () {
		return userServiceDao.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user =userServiceDao.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("id-" + id);
		}
		return user;
	}
	
	@PostMapping("/user")
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		userServiceDao.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();		
		return ResponseEntity.created(location).build();
		 
	}
}
