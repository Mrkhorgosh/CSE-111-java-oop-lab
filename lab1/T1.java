//Task 1
import java.util.Scanner;
public class T1{
  public static void main(String[]args){
   Scanner sc= new Scanner(System.in);
   int oddCount=0;
   int sum=0; int max=-99999999; int min=9999999;
   for(int i=0;i<10;i++){
      int n= sc.nextInt();
      if(n>0 && n%2!=0){
        oddCount++;
        sum+=n;
        if(n>max)
          max=n;
        else if(n<min)
          min=n;
      }
    }
      if(oddCount>0){
        double avg=(double)sum/oddCount;
        System.out.printf("Sum =%d\nMinimum = %d\nMaximum = %d\n Average = %f",sum,min,max,avg);
      }
      else
        System.out.print("No odd positive numbers found");
   
   
  }
}