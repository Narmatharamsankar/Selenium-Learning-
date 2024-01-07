package week3.day3;

public class Amazon extends CanaraBank implements Payments {

	public static void main(String[] args) {
	
		Amazon obj1 = new Amazon();
		
		obj1.recordPaymentDetails(); //Canarabank - abstract class method 

		obj1.cardPayments();
		obj1.cashOnDelivery();
		obj1.internetBanking();
		obj1.upiPaymentys();
 
	}
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery available");
		
	}

	public void upiPaymentys() {
	    System.out.println("UPI payments available");
		
	}

	public void cardPayments() {
		System.out.println("Card Payments available");
	}

	public void internetBanking() {
        System.out.println("Internet Banking available");
		
	}

}
