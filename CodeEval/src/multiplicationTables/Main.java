package multiplicationTables;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for(int i = 1; i < 13; i++){
			System.out.format("%4d", i);
			//System.out.print(i + " ");
			for(int x = 2; x < 13;x++){
				System.out.format("%4d", x * i);
			}
			System.out.println("");
		}
	}
}
