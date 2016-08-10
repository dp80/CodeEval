package challenges;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class decToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		final File file;
		final FileReader fr;
		final BufferedReader br;
		
		if (args.length != 1){
			System.exit(1);
		}
		
		file = new File(args[0]);
		if (!file.isFile()){
			System.exit(1);
		}
		String line;
		String binary;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while((line = br.readLine()) != null) {
				int num = Integer.parseInt(line);
				binary = "";
				//int remainder;
				int quotient = 0;
				int newnum = num;
				do {
					quotient = newnum % 2;
					binary = quotient + binary;
					//System.out.println("newnum: " + newnum + ", Quotient: " + quotient + " binary: " + binary);
				} while ((newnum = (newnum / 2)) != 0 );
				System.out.println(binary);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		

	}

}
