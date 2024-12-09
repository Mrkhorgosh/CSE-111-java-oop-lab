//Task 10
import java.util.Scanner;
public class TreasureHunt{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] arr2D = {{0, 0, 10, 0, -1},
                      {0, -1, 0, 0, -1},
                      {-1, 0, -1, 0, 0},
                      {0, -1, 7, 0, -1},
                      {0, -1, 0, -1, 0}
    };
    System.out.println("Initial Map:");
    printMap(arr2D);
    int row = arr2D.length;
    int col = arr2D[0].length;
    int row_pos = -1, col_pos = -1;
    //To-do: find out the position of the player
    
    for(int i=0;i<arr2D.length;i++){
      for(int j=0;j<arr2D[i].length;j++){
        if(arr2D[i][j]==7){
         row_pos=i; col_pos=j;
        }
      }
    }
    
    int turns = 5;
    while (turns > 0) {
      int new_row = row_pos, new_col = col_pos;
      System.out.printf("Enter move %d: ",(6-turns));
      String inp = sc.nextLine();
      /*To-do: Based on the input update the player position and check if
       * 1. the player fell out of the grid
       * 2. player stepped on mine
       * 3. player found the treasure
       * otheriwse, update the player position */
      
      if(inp.equals("RIGHT")){
        if(col_pos==arr2D[row_pos].length-1){
         System.out.println("Player fell outside the playing area. Game over!");
         break;
        }
        else
          col_pos+=1;
      }
      else if(inp.equals("LEFT")){
        if(col_pos==0){
        System.out.println("Player fell outside the playing area. Game over!");
        break;
        }
        else
        col_pos-=1;
      }
      else if(inp.equals("UP")){
        if(row_pos==0){
         System.out.println("Player fell outside the playing area. Game over!");
         break;
        }
        else
         row_pos-=1;
      }
      else if(inp.equals("DOWN")){
        if(row_pos==arr2D.length-1){
          System.out.println("Player fell outside the playing area. Game over!");
          break;
        }
        else
         row_pos+=1;
        
      }
      
      if(arr2D[row_pos][col_pos]==-1){
        System.out.println("Player stepped on mine. Game Over!");
        arr2D[row_pos][col_pos]=7;
        arr2D[new_row][new_col]=0;
        break;
      }

      else if(arr2D[row_pos][col_pos]==10){
        System.out.println("Treasure found. You win!");
        arr2D[row_pos][col_pos]=7;
        arr2D[new_row][new_col]=0;
        break;
      }
      else{
      arr2D[row_pos][col_pos]=7;
      arr2D[new_row][new_col]=0;
      }
      System.out.println("Current state:");
      printMap(arr2D);
      turns--;
    }
    if (turns == 0) {
      System.out.println("Failed to find the treasure.");
    }
  }
  
  public static void printMap(int[][] arr) { 
    // To-do: print the 2D grid
    for(int i=0;i<arr.length;i++){   
       for(int j=0;j<arr[i].length;j++){
         System.out.print(""+arr[i][j]+"      ");
       }
       System.out.println();
     }
  }
}