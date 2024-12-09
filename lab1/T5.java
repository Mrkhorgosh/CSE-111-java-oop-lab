//Task 5
import java.util.Scanner;
public class T5{
  public static void main(String[]args){
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the length of the array: ");
   int len= sc.nextInt();
   int [] arr= new int[len];
   
   for(int i=0;i<arr.length;i++){
     arr[i]=sc.nextInt(); 
   }
   int temp=0;
   int i=0; int j=len-1;
   while(i<j){
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    
    i++; j--;
   } 
   for(int k=0;k<len;k++){
     System.out.print(arr[k]+" ");
   }
  }
}