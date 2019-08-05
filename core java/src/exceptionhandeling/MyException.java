package exceptionhandeling;

public class MyException extends Exception

{
	public static final long serialVersionUID = 4664456874499611218L;
	
	public String errorCode="Unknown_Exception";
	
	public MyException(String message, String errorCode)
	{
		super(message);
		this.errorCode=errorCode;
	}
	
	public String getErrorCode()
	{
		return this.errorCode;
	}
	

}
