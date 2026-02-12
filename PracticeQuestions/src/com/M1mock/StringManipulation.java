package com.M1mock;
/*For each test case you are given:
A string str
An integer K
You must apply these operations in order:
🔹 Operations
Reverse the string
Replace vowels with next vowel
Copy code

a → e  
e → i  
i → o  
o → u  
u → a
Case-insensitive
Original case must stay (A→E, o→u, etc.)
Remove duplicate characters
Keep only the first occurrence
Rotate string to the RIGHT by K positions
🧠 Example Flow (hello 2)
hello
→ Reverse → olleh
→ Replace vowels → ulli h → ullih
→ Remove duplicates → ulih
→ Rotate right by 2 → ihul*/

import java.util.*;

public class StringManipulation {
	
	static void processString(String str,int k) {
		StringBuilder sb= new StringBuilder(str).reverse();
		//System.out.println(sb.toString());
		int l= sb.length();
		
		for(int i=0;i<l;i++) {
			char c= sb.charAt(i);
			
			if(c=='a') sb.setCharAt(i,'e');
			else if(c=='e') sb.setCharAt(i,'i');
			else if(c=='i') sb.setCharAt(i,'o');
			else if(c=='o') sb.setCharAt(i,'u');
			else if(c=='u') sb.setCharAt(i,'a');
			
			else if(c=='A') sb.setCharAt(i, 'E');
			else if(c=='E') sb.setCharAt(i, 'I');
			else if(c=='I') sb.setCharAt(i, 'O');
			else if(c=='O') sb.setCharAt(i, 'U');
			else if(c=='U') sb.setCharAt(i, 'A');
		}
		//System.out.println(sb.toString());
			
			Set<Character> set= new LinkedHashSet<>();
			String s2="";
			for(char ch: sb.toString().toCharArray()) {
				set.add(ch);
				
			}
			
			for(char ch: set) {
				s2+=ch;
			}
			//System.out.println(s2);
			
			int newLen= set.size();
			
			k= k%newLen;      //2%4=2
			String newStr= s2.substring(newLen-k);
			newStr+=s2.substring(0,k);
			System.out.println(newStr);
		
		
		
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases= sc.nextInt();
		
		while(testCases-- >0) {
			
			String s= sc.next();
			int k= sc.nextInt();
			processString(s, k);
			
		}
		sc.close();
	}

}
