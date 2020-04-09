package in.Spring_Framework_Master_Class.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Spring_Framework_Master_Class.common.UserAlreadyExistException;
import in.Spring_Framework_Master_Class.common.UserDoesNotExistException;
import in.Spring_Framework_Master_Class.models.User;
import in.Spring_Framework_Master_Class.services.LoginService;
import junit.framework.Assert;

public class TestException {

	@Test
	public void testForUserRegistration() throws UserAlreadyExistException {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserFirstName("example@example.com");
		user.setUserLastName("123hello1234");
		user.setUserName("admin");
		user.setUserEmail("outskirt");
		user.setUserPassword("james");
		user.setProfilePicture("james");
		LoginService loginservice = (LoginService) context.getBean(LoginService.class);
		loginservice.register(user);
		Assert.assertEquals(UserAlreadyExistException.message, "user already exists !..please login");
	}

	@Test
	public void testForUserLogin() throws UserDoesNotExistException {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserFirstName("example@example.com");
		user.setUserLastName("123hello1234");
		user.setUserName("admin");
		user.setUserEmail("outskirt");
		user.setUserPassword("james");
		user.setProfilePicture("james");
		LoginService loginservice = (LoginService) context.getBean(LoginService.class);
		loginservice.login(user.getUserName(), user.getUserPassword());
		Assert.assertEquals(UserDoesNotExistException.message, "user already exists !..please login");
	}
}
