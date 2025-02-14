public class Student{
  int id;
  double cg;
  boolean cgcheck=false;
  String[]added;
  int count=0;
  public Student(int id,double cg){
    this.id=id;this.cg=cg;
    cgcheck=true;
    if(cg>=3){
      added=new String[4];
    }
    else
      added=new String[3];
    System.out.println("A new Student with ID "+this.id+" and cgpa "+cg+"has been created");
  }
  public Student(int id){
   this.id=id;
   System.out.println("A new Student with ID "+this.id+" has been created");
  }
  public void addCourse(String s){
    if(cgcheck==false)
      System.out.println("Failed to add "+s+ "\nSet CG first");
    else{
      if(count<added.length){
      this.added[count]=s;
      count++;
      }
      else if(cg<3){
        System.out.println("Failed to add "+s);
        System.out.println("CG is low. Can't add more than 3 courses.");
      }
      else{
        System.out.println("Failed to add "+s+"\nMaximum  4 courses allowed.");
      }
    }
  }
  public void addCourse(String [] courses){
    if(courses.length>added.length){
      for(int i=0;i<added.length;i++){
         added[count]=courses[i];
         count++;
     }
     System.out.println("Failed to add "+courses[count]+"\nMaximum  4 courses allowed.");
    }
    else{
    for(int i=0;i<courses.length;i++){
      this.added[count]=courses[i];
      count++;
     }
   }
  }
  public void removeAllCourse(){
    count=0;
  }
  public void showAdvisee(){
    System.out.println("Student ID: "+id+", CGPA: "+cg);
    if(count>0){
      System.out.println("Added courses are:");
      for(int i=0;i<count;i++){
      System.out.print(added[i]+" ");
     }
      System.out.println();
    }
    else
      System.out.println("No courses added.");
  }
  public void storeCG(double d){
    this.cg=d;
    cgcheck=true;
    if(cg>=3){
      added=new String[4];
    }
    else
      added=new String[3];
  }
  public void storeID(int id){
    this.id=id;
  }
}