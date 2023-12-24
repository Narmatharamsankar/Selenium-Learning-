package week1.day2;

public class SecondSmallestNumber {
	
	int [] arr ;
	int ssn;
	public SecondSmallestNumber(int a[])
	{
		
		arr = a;
		
	}
	
	public void sortArray()
	{
		int length = arr.length;int temp =0;
		
		for (int i = length-1; i>=1;i--)
			
			for (int j= 0; j<=i-1;j++)
			
			{
				if(arr[j] > arr[j+1])
                
				{
					temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
				
				
			}
		return;
		
	}
	
	public void printArray()
	{
		System.out.println("Sorted array elements : ");
		for(int i : arr)
		{
			System.out.println(i);
		}
		
	}
	
	public void printSSN()
	{
		System.out.println("Second Smallest Number "+ arr[1]);
	}

	public static void main(String[] args) {
		
		int [] array = new int [] {23,45,67,32,89,22,103,56,12,35,77};
		
		SecondSmallestNumber SN = new SecondSmallestNumber(array);
		SN.sortArray();
		SN.printArray();
		SN.printSSN();
         
		
	}
	
	

}
