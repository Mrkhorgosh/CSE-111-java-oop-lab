public class Shelf{
  int capacity;
  int bookCount;
  public void showDetails(){
    System.out.println("Shelf capacity: "+capacity+"\nNumber of books: "+bookCount);
  }
  public void addBooks(int n){
    if(capacity==0)
      System.out.println("Zero capacity. Cannot add books.");
    else if(bookCount+n>capacity)
      System.out.println("Exceeds capacity");
    else{
      bookCount+=n;
      System.out.println(n+" books added to shelf");
    }
  }
   
}