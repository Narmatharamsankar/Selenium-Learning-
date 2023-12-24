package week1.day2;

public class Palindrome {
	
	int Number;
	int reverse;
	public Palindrome(int n)
	
	{
	  Number =n ;	
	}
	
	public int reverse()
	
	{   int n = Number;
		int temp;
		int rev = 0;
		
		while (n!=0)
			
		{ 
		  rev = rev * 10;
		  temp = n%10;
		  n = n/10;
		  rev = rev + temp ;
		   
		}
		
		System.out.println("reversed Number:" + rev);
		return rev;
	}
	
	public void isPalindrome()
	
	{
		
		if(Number == reverse())
			System.out.println(Number + " - Number is a Palindrome!");
		else 
	        System.out.println(Number + "- Number is not a Palindrome");
	 
	}
     		


  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindrome p = new Palindrome(2112);
		p.isPalindrome();
		
		Palindrome p1 = new Palindrome(1234);
		p1.isPalindrome();
    }
}
