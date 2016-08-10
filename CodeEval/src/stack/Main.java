package stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Main{

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		final File file;
		final FileReader fr;
		final BufferedReader br;
		Stack stack = new Stack();
		
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
				String[] nums = line.split(" ");
				for( int i = 0; i < nums.length; i++)
					stack.push(Integer.parseInt(nums[i]));
				
				for(int x = 0; x < stack.index; x++ ){
					System.out.print(stack.pop(x) + " ");
				}
				System.out.print("\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	interface StackInterface {
		void push (int num);
		int pop(int num);
	}

	static class Stack implements StackInterface {
		public int index;
		private List<Integer> stack;
		
		public Stack(){
			this.index = 0;
			this.stack = new ArrayList<Integer>();
		}
		
		public void push(int num){
			stack.add(num);
			index = stack.size() - 1;
		}
		
		public int pop(int num){		
			int tmp = stack.remove(index - num);
			--index;
			
			return tmp;
		}
	}
}