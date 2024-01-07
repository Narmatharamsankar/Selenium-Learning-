package week2.day2;

public class StringReverse {
	
	String S;
	String sReverse;
	
   public StringReverse(String i)
   {
	   S= i;
   }
   
   public void reverse()
   {
	   char[] a = S.toCharArray();
	   int length = S.length();
	   char b[]= new char[S.length()];int j=0;
	   for (int i=length-1;i>=0;i--)
	   {
		 b[j++] = a[i];
	   }
	  sReverse = new String(b);
   }
   void print()
   {
	   System.out.println("original String " + S);
	   System.out.println("reversed String " + sReverse);
   } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringReverse SR = new StringReverse("Test Leaf");
		SR.reverse();
        SR.print();
	}

}
