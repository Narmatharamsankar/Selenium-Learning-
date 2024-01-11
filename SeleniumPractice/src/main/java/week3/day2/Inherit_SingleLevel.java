package week3.day2;


public class Inherit_SingleLevel {

	public static void main(String[] args) {
	
      LoginTestData ltd = new LoginTestData();
      ltd.enterCredentials();
      ltd.enterUserName();
      ltd.enterPassword();
      ltd.navigateToHomePage();
      
	}

}
/*
 * Create a superclass as TestData. Implement 2 methods: enterCredentials(),
 * navigateToHomePage() in the TestData class. - Create subclasses and create 2
 * methods in each LoginTestData - enterUsername() - enterPassword() -
 * Demonstrate the concept by creating objects for both classes and calling
 * their methods.
 */