import java.io.*;
import java.util.*;

class CompTest implements Comparator<People>
{
	public int compare(People p1, People p2)
	{
		return p1.getName().compareTo(p2.getName());
	}
}

public class Collection1
{
	private enum SampleNames {
		john,
		joe,
		mark,
		david
	}
	private static ArrayList<People> plist = new ArrayList<People>();

	public Collection1() {

	}

	public static void main(String[] args)
	{
		/*
		for (int i = 0; i < SampleNames.values().length; i++) { //SampleNames.values() is an array, therefore length works
			String s = new String("John");
			//People p = new People(i, new String(SampleNames.values()[i]));
			//System.out.println(SampleNames.values()[i]);
		}*/

		People p1 = new People(10, "vik");
		People p2 = new People(20, "nita");
		People p3 = new People(30, "cake");

		plist.add(p1); plist.add(p2); plist.add(p3);

		System.out.println(plist); // prints the entire list

		for (int i = 0; i < plist.size(); i++) {
			System.out.println(plist.get(i)); //gets the object at that index
		}

		CompTest ct = new CompTest();
		Collections.sort(plist, ct);
		for (int i = 0; i < plist.size(); i++) {
			System.out.println(plist.get(i)); //gets the object at that index
		}


	}
}

class People
{
	private int age;
	private String enumname;

	public People(int age, String enumname)
	{
		this.age = age;
		this.enumname = enumname;
	}

	public int getAge()
	{
		return this.age;
	}

	public String getName()
	{
		return this.enumname;
	}

	// this overrides the toString() method in Object class, and it will be called when we do a sys.print.ln(obj)
	public String toString() 
	{
		return this.enumname + " - " + this.age;
	}
}