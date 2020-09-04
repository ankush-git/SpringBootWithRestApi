package helloWorld.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceDao {

	public static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1001, "Ankush", new Date()));
		users.add(new User(1003, "Swati", new Date()));
		users.add(new User(1006, "Jishu", new Date()));
		users.add(new User(1007, "Mummy", new Date()));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save (User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		} 
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for (User user: users) {
			if(user.getId()== id) {
				return user;
			}
		}
		return null;
	}
	
}
