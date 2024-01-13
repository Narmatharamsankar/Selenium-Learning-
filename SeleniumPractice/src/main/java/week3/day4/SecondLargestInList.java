package week3.day4;

import java.util.Arrays;
import java.util.List;

public class SecondLargestInList {
	
	
		public static void main(String [] args)
		{
			Integer[] arr = {3, 2, 11, 4, 6, 7};
			Arrays.sort(arr);
			List<Integer> arrList = Arrays.asList(arr);
			System.out.println(arrList);
			System.out.println("Second Largest " + arrList.get(4));
			
		}
	}


/*- Declare an array {3, 2, 11, 4, 6, 7}.
- Pick the 2nd element from the last and print it.*/
