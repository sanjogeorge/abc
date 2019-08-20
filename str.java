import java.util.*;
class str
{
public static void main(String args[])
 {
	
   String[] str2 = {"break","continue","for"};
   String s; 
  int c=0,i;
 Scanner input=new Scanner(System.in);
  System.out.println("enter the test string");
  s=input.next();

 for(i=0;i<3;i++)
 if(s.compareTo(str2[i])==0)
  {
  System.out.println("bulls eye");
c=1;
  
  }

 if(c==0)
  System.out.println("not a keyword");
  
 }
}
