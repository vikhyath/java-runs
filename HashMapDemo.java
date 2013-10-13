import java.io.*;
import java.lang.*;
import java.util.*;

public class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(2, "vik");
		hm.put(3, "nita");

		System.out.println("check: hm(5) " + hm.get(5));
		Iterator<Integer> it = hm.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println("key, val: " + key + '-' + hm.get(key));
		}
	}
}