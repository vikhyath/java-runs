import java.io.*;
import java.lang.*;
import java.util.*;

public class StackDemo
{
	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<Integer>();
		st.push(50);
		st.push(40);
		st.push(30);
		st.push(20);

		Iterator it = st.iterator();
		try {
			
			while(it.hasNext()) {
				System.out.println("Peek: " + st.peek());
				Integer x = st.pop();
				System.out.println("Popped: " + x);
				System.out.println("Stack: " + st);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}