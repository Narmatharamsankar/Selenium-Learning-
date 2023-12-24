package week1.day2;

public class ConvertToPositive {
	
	int Number;

	public ConvertToPositive(int N) {
		// TODO Auto-generated constructor stub
		this.Number = N;
	}
	
	public void toPositive()
	
	{   
		Number =  Number * -1;
	}
	
	public void print()
	
	{
		System.out.println("The number is " + Number );
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConvertToPositive CTP = new ConvertToPositive (-34);
		System.out.println("Before conversion");
		CTP.print();
		if (CTP.Number < 0)
		{
		System.out.println("After conversion");
		CTP.toPositive();
		CTP.print();
		}
		else 
			System.out.println("No Conversion needed for a Positive Number ");
	}

}
