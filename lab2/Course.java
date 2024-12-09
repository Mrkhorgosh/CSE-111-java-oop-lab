public class Course{
  public String name;
  public String code;
  public int credit;
  
  public void displayCourse(){
    System.out.println("Course Name");
    System.out.println(this.name);
    System.out.print("Course Code: ");
    System.out.println(this.code);
    System.out.print("Course Credit: ");
    System.out.println(this.credit);
  }
  
  public  void updateDetails(String n,String n1,int n3){
   name=n;
   code=n1;
   credit=n3;
     
  }
}