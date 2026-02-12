//wap to check whether the eneterd character ids vowel or consonant

import java.util.*;
class CheckVowel
{
  public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);

  char c= sc.next().charAt(0);
  if((c>='a' && c<= 'z') || (c>='A' && c<='Z')){
 if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
    {
	System.out.println("The given character is Vowel");
    }
  else{
        System.out.println("The given character is Consonant");
    }

  }
else{
	System.out.println("Enter alphabets only");
}

  
 

}
}