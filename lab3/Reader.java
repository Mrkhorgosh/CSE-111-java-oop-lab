public class Reader{
  String n;
  int cap;
  int bookCount;
  String []books;
  public  String createReader(String n,int cap){
    this.n=n;
    this.cap=cap;
    books=new String[this.cap];
    return "A new reader is created!";
  }
  public void readerInfo(){
    System.out.println("Name: "+n+"\nCapacity: "+cap);
    System.out.println("Books:");
    if(bookCount>0){
      for(int i=1;i<=bookCount;i++){
        System.out.println("Book "+i+": "+books[i-1]);
      }
    }
    else
      System.out.println("No books added yet");
  }
  public void addBook(String b){
    if(cap>bookCount){
      books[bookCount]=b;
      bookCount++;
    }
    else
      System.out.println("No more capacity");
  }
  
}