public class Borrower{
  public static int [] book_count={3,3,3};
  public static String[]book_name={"Pather Panchali", "Durgesh Nandini","Anandmath"};
  String name;
  String b="";
  public Borrower(String name){
    this.name=name;
  }
  public static void bookStatus(){
    System.out.println("Available Books:");
    for(int i=0;i<3;i++){
     System.out.println(book_name[i]+": "+book_count[i]);
    }
  }
  public void borrowBook(String s){
    for(int i=0;i<3;i++){
      if(s==book_name[i]){
        if(book_count[i]!=0){
          book_count[i]--;
          b+="\n"+s;
          break;
        }
        else{
          System.out.println("This book is not available.");
          break;
        }
      }
    }
  }
  public void borrowerDetails(){
    System.out.println("Name: "+name+"\nBooks Borrowed:"+b);
  }
  public static String remainingBooks(String s){
    for(int i=0;i<3;i++){
      if(s==book_name[i]){
        return book_count[i]+" Copies of "+s+" is remaining.";
      }
    }
    return "";
  }
}