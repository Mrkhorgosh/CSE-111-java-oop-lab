public class Usis{
  int totalAdvisee;
  Student []info=new Student[5];
  public Usis(){
    System.out.println("Usis is ready to use!");
  }
  public void login(Student st){
    if(st.email==null)
      System.out.println("Email and password need to be set.");
    else{
      st.log="online";
      System.out.println("Login successful");
    }
  }
  public void advising(Student st){
    if(st.log==null){
     System.out.println("Please login to advise courses!");
    }
    else{
       System.out.println("You haven't selected any courses.");
    }
  }
  
  public void advising(Student st,String c1,String c2,String c3,String c4){
    if(st.log==null){
     System.out.println("Please login to advise courses!");
    }
    else{
       System.out.println("You need special approval to take more than 3 courses.");
    }
  }
  
  public void advising(Student st,String c1,String c2,String c3){
    if(st.log.equals(null)){
     System.out.println("Please login to advise courses!");
    }
    else{
       st.advised+=c1+" "+c2+" "+c3+" ";
       System.out.println("Advising successful!");
       totalAdvisee++;
       info[totalAdvisee-1]=st;
    }
  }
  public void allAdviseeInfo(){
    for(int i=0;i<totalAdvisee;i++){
      System.out.println("Total Advisee: "+totalAdvisee);
      System.out.println("Name: "+info[i].n+" ID: "+info[i].id);
      System.out.println("Deparment: "+info[i].prog);
      System.out.println("Advised Courses:");
      System.out.println(info[i].advised);
      System.out.println("==============");
    }
  }
                       
}