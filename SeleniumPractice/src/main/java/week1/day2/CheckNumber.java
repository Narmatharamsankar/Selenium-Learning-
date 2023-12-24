package week1.day2;

public class CheckNumber {
     int Number;
	
     
    public CheckNumber(int Number) {
		// TODO Auto-generated constructor stub
		this.Number = Number;
	}
    
	public int getNumber()
     {
    	 return this.Number;
     }

	
	public boolean isNegetive (int n)
    {
    	if (n<0)
    	return true;
    	else 
    	return false;
    }
	
    public boolean isPositive (int n)
    {
        if (n>0)
    	return true;
        else 
    	return false;
    }
    
    public void print()
    {
    	
        if (isNegetive(Number))
        	System.out.println("The Number is Negetive"); 		
        else if (isPositive(Number))
            System.out.println("The Number is Positive");
        else 
            System.out.println("The Number is neither negetive nor Positive");
    }
    
	public static void main(String[] args) {
	  
		CheckNumber CN = new CheckNumber(7);
		System.out.println("Number :" + CN.getNumber()); 
        CN.print();
        
        CheckNumber CN1 = new CheckNumber(-7);
		System.out.println("Number :" + CN1.getNumber()); 
        CN1.print();
        
        CheckNumber CN2 = new CheckNumber(0);
		System.out.println("Number :" + CN2.getNumber()); 
        CN2.print();
        
        }

}
