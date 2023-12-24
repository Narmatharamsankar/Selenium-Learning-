package week1.day2;

public class Fibonacci {
  int range;
  public Fibonacci(int r)
  {
	  range =r;
  }
  public void  printFib()
  
  {
	  int sum = 0 ;
	  int num1  = 1;
	  int temp;
		    
	  for (int i =range ; i >= 1 ;i--)
			 {
		 
		       System.out.println(sum +" ");
		       temp=sum;
		       sum = sum + num1;
		       num1=temp;
		             
		     }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			Fibonacci Fib = new Fibonacci (5);
			Fib.printFib();

	}

}
