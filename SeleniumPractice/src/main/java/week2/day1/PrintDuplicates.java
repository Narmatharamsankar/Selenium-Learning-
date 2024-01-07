package week2.day1;
import java.util.Arrays;

public class PrintDuplicates {
	
	int [] num = {2,5,7,7,5,9,2,3};
	
public	void sortArray()
{
	Arrays.sort(num);
}
public void printDuplicates()
{
	System.out.println("List of duplicates:");
	for(int i = 0 ; i<num.length -1 ; i++)
	{
		if(num[i]==num[i+1])
			System.out.println(num[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		PrintDuplicates PD = new PrintDuplicates();
		PD.sortArray();
		PD.printDuplicates();
		
	}

}
