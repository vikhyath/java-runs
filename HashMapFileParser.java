import java.io.*;
import java.util.*;

/*
Reads a file input-1.txt like:

A B C D
a alpha first 1
b beta second 2
c gamma third 3
d delta fourth 4

and converts it into a key value pair:
{d={D=4, B=delta, C=fourth}, b={D=2, B=beta, C=second}, c={D=3, B=gamma, C=third}, a={D=1, B=alpha, C=first}}
*/

class HashMapFileParser
{
	public static void main(String args[])
	{
		// nested hashmap
		HashMap<String, HashMap<String, String>> hm = new HashMap<String, HashMap<String, String>>();
		
		// this guy can throw an exception
		try {
			File f = new File("input-1.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			ArrayList<String> cols = new ArrayList<String>();
			boolean first = true;
			String line;

			// read till the end of file
			while ((line = br.readLine()) != null) {
				// if first row is being read, then create the indeces
				if (first) {
					first = false;
					
					for (String s : line.split(" ")) {
						cols.add(s);
					}
					continue;
				}

				// for each file being read, convert the data to be indexed of the header row column
				HashMap<String, String>inner = new HashMap<String, String>();
				String[] arr = line.split(" ");
				for (int i = 1; i < arr.length; i++) {
					inner.put(cols.get(i), arr[i]);
				}
				
				// finally store the nested hash into in its parent
				hm.put(arr[0], inner);
			}
			
			System.out.println(hm);
			System.out.println(hm.get("c").get("C"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}