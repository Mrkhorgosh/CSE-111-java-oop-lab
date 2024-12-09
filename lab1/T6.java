//Task 6
import java.util.Scanner;
public class T6{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int len= sc.nextInt();
    int []ar1= new int[len];
    for(int i=0;i<len;i++){
     ar1[i]=sc.nextInt();
    }
    int uniqCount=0;
    for(int i=0;i<len;i++){
     int prev_count=0;
     for(int j=0;j<i;j++){
       if (ar1[i]==ar1[j]){
        prev_count++;
       }
     }
     if (prev_count==0)
       uniqCount++;
    }
    //System.out.println(uniqCount);  
    
    int [] ar2= new int[uniqCount];
    int count=0;
    for(int i=0;i<len;i++){
     int prev_count=0;
     for(int j=0;j<i;j++){
       if (ar1[i]==ar1[j]){
        prev_count++;
       }
     }
     if (prev_count==0){
       ar2[count]=ar1[i];
         count++;
     }
    }
    
    for(int i=0;i<uniqCount;i++){
      int times=0;
      for(int j=0;j<len;j++){
        if(ar2[i]==ar1[j])
          times++; 
      }
      System.out.printf(ar2[i]+" - %d times\n",times);
    }
    
   //for( int i=0;i<uniqCount;i++){
    // System.out.println(ar2[i]);
   //}
  }
}