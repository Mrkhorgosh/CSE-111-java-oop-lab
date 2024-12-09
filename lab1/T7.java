//Task 7
import java.util.Scanner;
public class T7{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    double [] arr= new double[len];
    System.out.println("Please enter the elements of the array");
    int rmv=0;
    for(int i=0;i<len;i++){
     arr[i]=sc.nextInt();
     if(i>=1){
       if(arr[i]==arr[i-1]){
         rmv++;
       }
     }
    }
    System.out.println(rmv);
    double[] new_arr=new double[len-rmv];
    int j=0;
    for(int i=0;i<len;i++){
      if(i==0){
        new_arr[j]=arr[i];
        j++;
      }
      else if(i>=1){
        if(arr[i]==arr[i-1]){
         continue;
       }
        else{
          new_arr[j]=arr[i];
          j++;
        }
     }
    }
    System.out.print("New Array: ");
    for(int i=0;i<new_arr.length;i++){
      System.out.print(new_arr[i]+" ");
    }
    System.out.println();
    System.out.println("Removed elements :"+rmv);
    
  }
}