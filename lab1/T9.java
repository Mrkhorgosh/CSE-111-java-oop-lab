//Task 9
import java.util.Scanner;
public class T9{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] arr=new int[n][n];
    boolean flag =true;
    for(int i=0;i<arr.length;i++){    
      for(int j=0;j<arr[i].length;j++){
       arr[i][j]=sc.nextInt();    
     }
    }
    for(int i=0;i<arr.length;i++){ 
      if(flag==false)
        break;
      for(int j=0;j<arr[i].length;j++){
        if(i==j){
          if(arr[i][j]!=1){
           flag=false;
           break;
          }  
        }
        else{
          if(arr[i][j]!=0){
            flag=false;
            break;
          }
        }
     }
    }
    if(flag==true)
      System.out.println("Identity Matrix");
    else
      System.out.println("Not an Identity Matrix");
 
  }
}