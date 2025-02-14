public class Teacher{
  String name;
  String ini;
  String courses;
  public Teacher(String name, String ini){
   this.name=name;this.ini=ini;
   System.out.println("A new teacher has been created");
  }
  public void addCourse(Course c){
   courses+=c.courseName+"\n";
  }
  public void printDetail(){
    System.out.println("Name: "+name);
    System.out.println("Initial: "+ini);
    System.out.println("list of courses: ");
    System.out.print(this.courses);
  }
}