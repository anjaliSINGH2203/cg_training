//WAP TO CHECK WHETHER THE ENTERED CHAR IS ALPHABET OR NOT IF IT IS ALPHABET JUST TELL WHETHER IT IS LOWERCASE OR UPPERCASE

import java.util.*;
class Char{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);

System.out.println("enter a character");
char a= sc.next().charAt(0);

if((a>='A' && a<='Z') || (a>='a' && a<='z'))
{
  if(a>='A' && a<='Z')
   {
     System.out.println("The given character"+ a+"  is an UPPERCASE alphabet ");
   }
  else{
     System.out.println("The given character"+ a+"  is a LOWERCASE alphabet ");
}


}
else{
    if(a>='0' && a<='9')
      {
        System.out.println("The given character"+ a+"  is not an alphabet but a digit ");
      }else{
        System.out.println("The given character"+ a+"  is not an alphabet but a special character ");
       }

}

}
}
