package week3.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSortList {

	public static void main(String[] args) {
		String[] companies = {"HCL", "Wipro", "Aspire Systems","CTS"};
		Arrays.sort(companies);
		List<String>companiesList = Arrays.asList(companies);
		for(int i=3;i>=0;i--)
	     System.out.println(companiesList.get(i));
		
		
	}

}
/*
 * Declare a String array and add the values as {HCL, Wipro, Aspire Systems,
 * CTS} Add the collection to a list Iterate the values in the list Print the
 * required output as Wipro, HCL, CTS, Aspire Systems
 */