//Task 3
import java.util.Scanner;
public class T3{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   String str1= sc.next();
   String str2=sc.next();
   String str3= str1 + " "+ str2;
   int total=0;
   for(int i=0;i<str3.length();i++){
     int a=(int)str3.charAt(i);
     if(a>=65 && a<=122)
       total+=a;
   }
   System.out.println(str3);
   System.out.println(total);
  }
}