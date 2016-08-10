package longestLines;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String [] args) throws IOException{
		
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int lines = 0;
        ArrayList strArray = new ArrayList<String>();
        int outputnum = Integer.parseInt(buffer.readLine());
        while ((line = buffer.readLine()) != null) {
             strArray.add(line.trim());
        }
        
        int count = strArray.size();
        do
        {
        	int longest = 0;
        	for( int i = strArray.size() - 1; i   > 0 ; i--){
        		String StrCurrent = (String) strArray.get(i);
        		String StrNext = (String) strArray.get(i-1);
        		if( StrNext.length() < StrCurrent.length()){
        			strArray.remove(i-1);
        			strArray.add(i, StrNext);
        		}
        		
        	}
        	count--;
        	
        }while (count > 0);
        
        for(int i = 0; i < outputnum; i++)
    		System.out.println(strArray.get(i));
	}
}
