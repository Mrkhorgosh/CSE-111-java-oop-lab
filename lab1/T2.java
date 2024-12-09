//Task 2
import java.util.Scanner;
public class T2{
  public static void main(String[]args){
   Scanner sc= new Scanner(System.in);
   int x= sc.nextInt();
   int y= sc.nextInt();
   int prime_count=0;
   boolean cond =true;
   if(y>x)
     cond= false;
   if(cond==true){
     for(int i=y;i<=x;i++){
       boolean prime=true;
       for(int j=2; j<i;j++){
         if(i%j==0){
          prime=false;
         }       
       }
       if(prime==true)
        prime_count++;  
     }
     
   }
   else{
     for(int i=x;i<=y;i++){
       boolean prime=true;
       for(int j=2; j<i;j++){
         if(i%j==0){
          prime=false;
         }
          
       }
       if(prime==true)
        prime_count++;
     }
   
   }
   if (cond==true)
    System.out.printf("There are %d prime numbers between %d and %d.",prime_count,y,x);
   else
      System.out.printf("There are %d prime numbers between %d and %d.",prime_count,x,y);
  }
}