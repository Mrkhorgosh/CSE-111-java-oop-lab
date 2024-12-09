//Task 8
import java.util.Scanner;
public class T8{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("row = ");
    int row=sc.nextInt();
    System.out.println("Column = ");
    int column=sc.nextInt();
   
    int [][] array1= new int[row][column];
    int len=row*column;
    int [] array2=new int[len];
    for(int i=0;i<array1.length;i++){    // puttin 2d array value
      for(int j=0;j<array1[i].length;j++){
       array1[i][j]=sc.nextInt();    
     }
    }
    System.out.println("2D Array:");
     for(int i=0;i<array1.length;i++){   //printing 2d array
       for(int j=0;j<array1[i].length;j++){
         System.out.print(array1[i][j]+" ");
       }
       System.out.println();
     }
     int k=0;
     for(int i=0;i<array1.length;i++){    
      for(int j=0;j<array1[i].length;j++){
       array2[k]= array1[i][j];
       k++;
     }
    }
     System.out.println("1D Array:");
     for(int i=0;i<array2.length;i++){
       System.out.print(array2[i]+" ");
     }
     
    
  }
}