public class Book{
  static  int total_books_sold;
  static double total_revenue;
  
  String n; double price=150;
  
  public Book(String s,int d){
   n=s;
   price=price-(price*d/100);
   total_books_sold++;
   total_revenue+=price;
  }
  public void bookDetails(){
    System.out.println("Title: "+n+"\nPrice after discount: "+price+"TK");
  }
}