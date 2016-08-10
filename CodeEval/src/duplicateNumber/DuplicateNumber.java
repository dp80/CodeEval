/**
 * 
 */
package duplicateNumber;

import java.lang.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
/**
 * @author patildhi
 *Finds a duplicate number from 1 to N numbers
 */
public class DuplicateNumber {

	private int lowest;
	private int highest;
	private int count;
	private int aListCount;
	
	public int findDuplicateNumber(List<Integer> numbers){
        int count = 0;
        int highestNumber = numbers.size();
        for(int i = 0; i  < highestNumber; i++){
        	int value = numbers.get(i);
        	count++;
        	for (int x = i+1; x < highestNumber; x++){
        		if(numbers.get(x) == value){
        			return numbers.get(i);
        		}
        	}
        	count--;
        }
        return -1;
    }
     


		
}
