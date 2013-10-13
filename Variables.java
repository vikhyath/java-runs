import java.lang.*;
import java.io.*;

class Driver
{
	public Driver(){}

	int x = 10;
	int y;

	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}
}

class Variables
{
	public static void main(String[] args)
	{
		Driver v = new Driver();

		v.x = 15;
		v.y = 20;

		System.out.println("x is " + v.getX() + " and y is " + v.getY());
	}
}
