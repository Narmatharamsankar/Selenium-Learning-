package week3.day4;


import java.util.Arrays;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a = {3, 2, 11, 4, 6, 7};
		Integer[] b = {1, 2, 8, 4, 9, 7};
        List <Integer> aList = Arrays.asList(a);
        List <Integer> bList = Arrays.asList(b);
        
        for (Integer i : aList)
             for (Integer j : bList)
           	   if(i==j)
        	   System.out.println(i + "  is duplicate element");
        	   
           }
		
	}
/*- Declare an array for {3, 2, 11, 4, 6, 7}
- Declare another array for {1, 2, 8, 4, 9, 7}
- Compare both the arrays
- Print the values if they are equal*/