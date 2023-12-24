package week1.day2;

public class Intersection {
	//* a) Declare An array for {3,2,11,4,6,7};	 
	// * b) Declare another array for {1,2,8,4,9,7};
	
	Integer [] arr1;
	Integer [] arr2;
	public Intersection ()
	{	
	 arr1=  new Integer[] {3,2,11,4,6,7};
	 arr2 = new Integer[] {1,2,8,4,9,7};
	}
	
	public void printIntersection()
	{
		for(int i=0;i<=5;i++)
			for (int j=0;j<=5;j++)
			{
			  if (arr1[i] == arr2[j])
					  System.out.println(arr1[i]);
			  
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Intersection I = new Intersection();
	   I.printIntersection();
	}
	
	

}
