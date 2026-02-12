package StringManipulation;
import java.util.*;

public class CountVowels {
	public static void main(String args[]) {
		String s= "Anjali Singh";
		int count=0;
		for(char c: s.toCharArray()) {
			if("aeiouAEIOU".indexOf(c)!=-1) {
				count++;
			}
		}
		System.out.println(count);
		
		
		//REMOVE DUPLICATE CHARACTERS 
		String s1="";
		Set<Character> set= new LinkedHashSet<>();
		for(char c: s.toCharArray()) {
			if(set.add(c)) {
				s1+=c;
		}
	    
	}System.out.println(s1);	

}
}

