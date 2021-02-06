package simple_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteFileContent {

	public static void main(String[] args) {
		
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
		File inFile =new File("/home/ishwor/Documents/Java Text/read.txt");
		File outFile =new File("/home/ishwor/Documents/Java Text/write.txt");
		
		input =new  FileInputStream(inFile);
		output = new FileOutputStream(outFile);
		
		byte[]  buffer = new byte[1024];
		int length;
		
		while((length =input.read(buffer))> 0) {
			output.write(buffer,0, length);
		}
		input.close();
		output.close();
			
		System.out.println("Successfully copied content to file");
		}  catch(IOException e){
			System.out.println(e.toString());
		};
	}

}
