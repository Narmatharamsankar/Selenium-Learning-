package week1.day1;

public class mobile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
        System.out.println("This is MY MOBILE");
        
        mobile mymobile = new mobile();
        mymobile.makeCall();
        mymobile.sendMsg();
        
	}

	public void makeCall()
	{
		String mobileModel = "Samsung Galaxy S9";
		float mobileWeight = 200;
	 System.out.println( "Mobile model is "+ mobileModel);	
	 System.out.println("Mobile weight is "+ mobileWeight);
	
	}
	public void sendMsg()
	{
		 boolean isFullCharged =true;
		 int mobileCost = 20000;
		 
		System.out.println("Is the mobile fully charged ? "+ isFullCharged);
		System.out.println("Cost of the mobile " + mobileCost );
	}
}