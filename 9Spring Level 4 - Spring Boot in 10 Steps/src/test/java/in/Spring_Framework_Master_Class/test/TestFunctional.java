package in.Spring_Framework_Master_Class.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Spring_Framework_Master_Class.models.User;
import in.Spring_Framework_Master_Class.services.LoginService;
import in.Spring_Framework_Master_Class.services.UserService;

public class TestFunctional {

	
	@Test
	public void testCreateUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spring_Framework_Master_Class-application.xml");
		User user = new User();
		user.setUserId(1);
		user.setUserFirstName("example@example.com");
		user.setUserLastName("123hello1234");
		user.setUserName("admin");
		user.setUserEmail("outskirt");
		user.setUserPassword("james");
		user.setProfilePicture("james");
		
	    int userId=user.getUserId();

		LoginService loginservice=(LoginService) context.getBean(LoginService.class);
		boolean userfromdb=loginservice.register(user);
		assertSame(userId,userfromdb);
	}
	
	@Test
	public void testGetUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserId(1);
		user.setUserFirstName("example@example.com");
		user.setUserLastName("123hello1234");
		user.setUserName("admin");
		user.setUserEmail("outskirt");
		user.setUserPassword("james");
		user.setProfilePicture("james");
		
	    int userId=user.getUserId();

		UserService userservice=(UserService) context.getBean(UserService.class);
		User userfromdb=userservice.get(user.getUserId());
		assertSame(userId,userfromdb);
	}
	
	@Test
	public void testUpdateBuyer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserId(1);
		user.setUserFirstName("example@example.com");
		user.setUserLastName("123hello1234");
		user.setUserName("admin");
		user.setUserEmail("outskirt");
		user.setUserPassword("james");
		user.setProfilePicture("james");
		
	    int userId=user.getUserId();

	    UserService userservice=(UserService) context.getBean(UserService.class);
		boolean isUpdated=userservice.update(user);;
		assertSame(userId,isUpdated);
	}
	@Test
	public void testDeleteBuyer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserId(1);
		user.setUserFirstName("example@example.com");
		user.setUserLastName("123hello1234");
		user.setUserName("admin");
		user.setUserEmail("outskirt");
		user.setUserPassword("james");
		user.setProfilePicture("james");
		
	    int userId=user.getUserId();

	    UserService userservice=(UserService) context.getBean(UserService.class);
		boolean isDelete=userservice.delete(user);
		assertSame(userId,isDelete);
	}
	
}

