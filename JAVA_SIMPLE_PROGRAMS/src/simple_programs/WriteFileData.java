package simple_programs;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteFileData {

	public static void main(String[] args) {
	try {
		FileOutputStream fileOutputStream = new  FileOutputStream("/home/ishwor/Documents/Java Text/write.txt");
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-16");
		BufferedWriter bw = new BufferedWriter(outputStreamWriter);
		
		bw.write("This is writtem with buffere writer");
		bw.newLine();
		bw.write("This is new Line");
		bw.close();
		System.out.println("File Written Successfully");
		
	}catch(IOException e) {
		e.printStackTrace();
	}

	}

}
