package in.Spring_Framework_Master_Class.dao;

import in.Spring_Framework_Master_Class.models.User;

public interface LoginServiceDao {

	boolean register(User user);
	boolean login(String userName,String password);
	boolean resetPassword(String userName,String password);
}
