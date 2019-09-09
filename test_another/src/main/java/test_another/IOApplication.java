package test_another;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class IOApplication {
public static void main(String[] args) throws IOException {
	try {
		File file = new File("text.txt");
		InputStream is = new FileInputStream (file);
		int i=0;
		
				  while ((i = is.read())!= -1){
					  System.out.println((char)i);
				
				  }
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

	
	
	/*//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter ("text.txt")); 
	try {
		BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter ("text.txt"));
		bufferedWriter1.write(" Hello Wold");
		bufferedWriter1.newLine();
		bufferedWriter1.write("My name is John Doe ");
		bufferedWriter1.newLine();
		bufferedWriter1.write("This a mysterious file");
		bufferedWriter1.newLine();
		bufferedWriter1.write("Hello Wold");
		bufferedWriter1.flush();
		bufferedWriter1.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	} 
}
}
	try {
	BufferedReader  br = new BufferedReader (new FileReader ("text.txt"));
	//System.out.println(br.read()); // this will print only one character
			
			 * while (br.ready()) {
			 *  System.out.println(br.readLine()); 
			 *  } THIS ONE WAYS OF READING  IN FILE 
			 
	
	// And this reading is with stream  with Lambda Expression 
	 br.lines().forEach(str -> System.out.println(str));
		
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	}
	
	
*/