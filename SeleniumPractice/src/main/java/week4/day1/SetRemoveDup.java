package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetRemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "google";
		
		char ch_S[] = S.toCharArray();
		
		Set<Character> SS = new LinkedHashSet <Character> ();
		
		for(int i = 0; i<ch_S.length ; i++)
		SS.add(ch_S[i]);
		
        System.out.println(SS);
	}
     
}
