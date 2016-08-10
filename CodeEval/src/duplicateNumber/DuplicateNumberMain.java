package duplicateNumber;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		DuplicateNumber dn = new DuplicateNumber();
		System.out.println("Duplicate Number : " + dn.findDuplicateNumber(numbers));
	}

}
