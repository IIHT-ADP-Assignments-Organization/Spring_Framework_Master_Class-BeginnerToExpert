package in.Spring_Framework_Master_Class.services;

import in.Spring_Framework_Master_Class.models.User;

public interface LoginService {
	boolean register(User user);
	boolean login(String userName,String password);
	boolean resetPassword(String userName,String password);
}
