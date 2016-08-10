package lowercase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
	
		final File file;
		final FileReader fr;
		final BufferedReader br;
		
		System.out.println("Starting Program");
		if (args.length != 1){
			System.err.println("Invalid Command Line argument length.  One argument required");
			System.exit(1);
		}else
			System.out.println("Arguments length is: " + args.length);
		
		file = new File(args[0]);
		if (file.isFile()){
			System.out.println("This seems to be valid File");
		}else{
			System.out.println("This is not valid file");
			System.exit(1);
		}
			String line;
			
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				while((line = br.readLine()) != null) {
					String tmp = line.toLowerCase();
					System.out.println(tmp);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println(file.toString());
		
	}
}
