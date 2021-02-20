package simple_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleInterestInFile {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File("/home/ishwor/Documents/Java Text/source.txt"));
		PrintWriter out = new PrintWriter(new File("/home/ishwor/Documents/Java Text/dest.txt"));

		while (in.hasNext()) {
			String name = in.next();
			float p = in.nextFloat();
			float t = in.nextFloat();
			float r = in.nextFloat();
			float result = (p*t*r)/100;
			
			out.printf("%s %.2f %.2f %.2f %.2f %n", name, p, t, r, result);
			
		}
		System.out.println("Successfully calculated interest and saved in dest.txt file");
		in.close();
		out.close();

	}

}
