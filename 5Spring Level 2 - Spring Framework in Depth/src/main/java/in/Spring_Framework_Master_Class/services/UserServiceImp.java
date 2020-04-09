package in.Spring_Framework_Master_Class.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Spring_Framework_Master_Class.dao.UserDao;
import in.Spring_Framework_Master_Class.models.User;

@Service("UserService")
@Transactional
public class UserServiceImp implements UserService {

	@Autowired(required = true)
	private UserDao userDao;

	public int save(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User get(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
