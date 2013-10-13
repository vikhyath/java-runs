import java.io.*;
import java.lang.*;

public class FileTest
{
	FileTest() {

	}

	public static void main(String[] args)
	{
		try {
			File f = new File("file.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr); 
			// something similar with inputstream would be:
			// BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
			// br.read() - will read a line from input

			String line;
			while ((line = br.readLine()) != null) {
				for (String t : line.split(" ")) {
					System.out.println(t);
				}
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}