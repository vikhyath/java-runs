import java.io.*;
import java.lang.*;
import java.util.*;

// Note if putting multiple classes in same file then mark only one class public or protected or private

interface Contract
{
	int x = 55; // okay to have variables in interfaces
	public void func1();
	public void func2();
}
abstract class OldTest
{
	public OldTest()
	{
		System.out.println("OldTest constructor\n");
	}

	public void saywelcome()
	{
		System.out.println("Welcome\n");
		saybye();
	}

	public void saybye()
	{
		System.out.println("bye\n");
	}

	public abstract void func3(); //<- if this is not overridden it will now throw an error because child class does not override the abstract method

	public void polymorphism(ArrayList<OldTest> list)
	{
		for (OldTest obj : list) {
			obj.func3();
		}
	}
}

public class Test extends OldTest implements Contract
{
	public void func1()
	{

	}

	public void func2()
	{

	}
	
	public void func3()
	{
		System.out.println("Test's func3\n");
	}

	public Test()
	{
		super();
		System.out.println("hello word!" + x);
	}

	ArrayList<OldTest> objlist = new ArrayList<OldTest>();
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.saywelcome();

		OldTest oldt1 = new Test();
		OldTest oldt2 = new Sample();

		// we really need t.anything to call anything because a non-static member cannot be accessed
		// from a static context
		t.objlist.add(oldt1);
		t.objlist.add(oldt2);


		t.polymorphism(t.objlist);
	}
}

class Sample extends OldTest
{
	public Sample()
	{
		System.out.println("Sample constructor\n");
	}

	public void func3()
	{
		System.out.println("Sample's func3\n");
	}
}
