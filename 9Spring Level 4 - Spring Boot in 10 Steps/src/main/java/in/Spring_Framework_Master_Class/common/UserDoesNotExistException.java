package in.Spring_Framework_Master_Class.common;

public class UserDoesNotExistException extends Exception{
	public static  String message="user already exists !..please login";


	public UserDoesNotExistException()
	{
		
	}
	public UserDoesNotExistException(String message)
	{
		this.message=message;
	}
}
