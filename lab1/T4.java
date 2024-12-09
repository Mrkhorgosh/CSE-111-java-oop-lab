//Task 4
import java.util.Scanner;
public class T4{
  public static void main(String[]args){
   Scanner sc= new Scanner(System.in);
   String str1=sc.nextLine();
   String str2="";
   for(int i=0;i<str1.length();i++){
    int a=(int)str1.charAt(i);
    a--;
    str2+=(char)a;
   }
   System.out.println(str2);
   
  }
}