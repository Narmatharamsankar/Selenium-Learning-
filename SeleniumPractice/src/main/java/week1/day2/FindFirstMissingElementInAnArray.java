package week1.day2;

public class FindFirstMissingElementInAnArray {
	
	Integer [] arr;
	
	public FindFirstMissingElementInAnArray()
	{
		arr = new Integer [] {1,2,3,4,7,6,8};
	}
	public void findMissingNumber() {
		
		for(int i = 0 ; i< arr.length; i++)
			
			if (arr[i]!=i+1 )
			{
				System.out.println("missing number: " + (i+1) );
				break;
			}
	}


	public static void main(String[] args) {
		
		FindFirstMissingElementInAnArray ele = new FindFirstMissingElementInAnArray();
		
		ele.findMissingNumber();
	}

}
