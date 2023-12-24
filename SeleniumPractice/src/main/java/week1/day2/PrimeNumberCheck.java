package week1.day2;


public class PrimeNumberCheck {
	
	int Number;
	
	public  PrimeNumberCheck(int n)
	{
     this.Number = n;
	}
	
	public boolean isPrime()
	
	{
		boolean flag = true;
		
		for( int i = 1 ; i <= Number/2; i++)
		{
		  if (Number == 1)
		    {
			 flag = false;
			 break;
		    }
		  else if (Number == 2)
			  {
			  flag = true;
			  break;
			  }
		  else if (Number%i == 0 && (i!=1))
		  {
			flag = false;
			break;
		  }
	    }
				
	   	return flag;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberCheck PNC = new PrimeNumberCheck(3361);
		
		if (PNC.isPrime())
			{
			System.out.println("The number is prime");
			}
		else 
			{
			System.out.println("The Number is not prime");
			};
			
			
		
	}

}
