public class BracuStudent{
  String n;
  String d;
  boolean pass=false;
  public BracuStudent(String n, String d){
    this.n=n;this.d=d;
  }
  public void showDetails(){
    System.out.println("Student Name: "+n);
    System.out.println("Lives in "+d);
    if(pass==false)
      System.out.println("Have Bus  pass? false"); 
    else
      System.out.println("Have Bus  pass? true");
  }
  public void getPass(){
    pass=true;
  }
  public void updateHome(String d){
    this.d=d;
  }
}