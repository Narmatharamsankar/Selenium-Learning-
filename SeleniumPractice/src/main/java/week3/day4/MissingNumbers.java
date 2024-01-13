package week3.day4;

import java.util.Arrays;
import java.util.List;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(a);
        List <Integer> aList = Arrays.asList(a);
        Integer count = aList.get(6);
        Integer j = 0;
       for(Integer i : aList)
       { 
    	   while( j != i)
    	   {
    		   System.out.println(j);
    		   j++; 
    	   }
    	j++	  ;
       }
        
	}

}
/*
 * Declare an array {1, 2, 3, 4, 10, 6, 8}. - Do a comparison check if there is
 * a gap in the sequence of numbers. - Print the numbers that are missing.
 */