import java.io.*;
import java.lang.*;

public class TestException
{
	public static void main(String[] args)
	{
		ThrowClass obj = new ThrowClass();

		try {
			obj.openfile(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}


	}
}

class ThrowClass
{
	static {
		System.out.println("In Static of ThrowClass");
	}

	public ThrowClass()
	{
		System.out.println("In Constructor of ThrowClass");
	}

	public void openfile(boolean var) throws Exception
	{
		if (var) {
			throw new Exception("this is an Exception");
		} else {

		}
	}
}