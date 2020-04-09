package in.Spring_Framework_Master_Class.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.Spring_Framework_Master_Class.models.User;

public class TestBoundary {

	@Test
	public void testpasswordLength() {
		User user = new User();
		user.setUserId(1);
		user.setUserFirstName("example@example.com");
		user.setUserLastName("123hello1234");
		user.setUserName("admin");
		user.setUserEmail("outskirt");
		user.setUserPassword("1234567890");
		user.setProfilePicture("james");

		int passwordLength = 10;
		assertEquals(passwordLength, user.getUserPassword().length());

	}

	@Test
	public void testUserNameLength() {
		User user = new User();
		user.setUserFirstName("example@example.com");
		user.setUserLastName("123hello1234");
		user.setUserName("user23");
		user.setUserEmail("outskirt");
		user.setUserPassword("james");
		user.setProfilePicture("james");

		int maxChar = 5;
		boolean usernamelength = ((user.getUserName().length()) >= maxChar);
		assertEquals(usernamelength, true);
	}
}
