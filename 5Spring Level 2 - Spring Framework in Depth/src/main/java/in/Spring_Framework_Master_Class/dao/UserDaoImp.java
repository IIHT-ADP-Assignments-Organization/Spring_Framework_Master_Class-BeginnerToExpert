package in.Spring_Framework_Master_Class.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.Spring_Framework_Master_Class.models.User;

@Repository
public class UserDaoImp implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

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
