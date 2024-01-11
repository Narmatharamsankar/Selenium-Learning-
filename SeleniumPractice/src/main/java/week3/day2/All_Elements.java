package week3.day2;

public class All_Elements extends Button_Class {

	public static void main(String[] args) {

		WebElement_Base web = new WebElement_Base();
		web.setText("-base class call");
		
		Button_Class bc = new Button_Class();
		bc.submit();
		bc.setText("- subclass call - Button_class");
		
		Text_Field tf = new Text_Field();
		tf.get_Text("set text");
		tf.setText("- subclass call from Text_Field class");
		
		Radio_Button rb = new Radio_Button();
		rb.submit();
		rb.selectRadioButton();
		rb.setText("from multi level inherit -  Radio_button class");
		
		Check_Box cb = new Check_Box();
		cb.submit();
		cb.click_checkButton();
		cb.setText("from multi level inherit -  Check_Box class");
		
		All_Elements ae = new All_Elements();
		ae.submit();
		ae.setText("from multi level inherit -  All_Elements class");
			 
	}

}
