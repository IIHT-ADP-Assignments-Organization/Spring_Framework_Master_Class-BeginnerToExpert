package in.Spring_Framework_Master_Class.dao;

import java.util.List;

import in.Spring_Framework_Master_Class.models.User;

public interface UserDao {
	
	int save(User user);
	
	User get(int userId);
	  
	List<User> list();
	  
	boolean update(User user);
	  
	boolean delete(User user);
	 
}
