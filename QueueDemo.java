import java.io.*;
import java.lang.*;
import java.util.*;

public class QueueDemo
{
	public static void main(String args[])
	{
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(12);
		q.add(13);
		q.add(14);

		Iterator it = q.iterator();

		while(it.hasNext()) {
			System.out.println("popped: " + q.remove());
			System.out.println("queue: " + q);
		}
	}
}