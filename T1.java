package AutomationTesting;

import java.util.*;
public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = { 2, 4, 3, 2, 6, 1, 4, 5 };
		findDuplicates(array);

	}
	
	public static void findDuplicates(int[] array) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> dub = new HashSet<>();

		for (int num : array) {
			if (!set.add(num)) {
				dub.add(num);
			}
		}
		System.out.println(dub);
		
		
	}

}
