public class Employee{
  String name;
  double salary=30000.0;
  String designation="junior";
  public void newEmployee(String name){
  this.name=name;
  }
  public void displayInfo(){
    System.out.println("Employee Name: "+name);
    System.out.println("Emoloyee Salary: "+salary);
    System.out.println("Employee Designation: "+designation);
  }
  public void calculateTax(){
    double tax;
    if(salary>30000 && salary<=50000){
      tax=salary*0.1;
      System.out.println(name+"Tax Amount: "+tax);
    }
    else if(salary>50000){
      tax=salary*0.3;
      System.out.println(name+"Tax Amount: "+tax);
    }
    else
      System.out.println("No need to pay tax");
  }
  public void promoteEmployee(String d){
    designation=d;
    if(designation.equals("senior")){
      salary+=25000;
      System.out.println(name+ "has been promoted to" +designation);
      System.out.println("New Salary : "+salary);
    }
    else if(designation.equals("lead")){
      salary+=50000;
      System.out.println(name+ "has been promoted to " +designation);
      System.out.println("New Salary : "+salary);
    }
    else if(designation.equals("manager")){
     salary+=75000;
      System.out.println(name+ "has been promoted to" +designation);
      System.out.println("New Salary : "+salary);
    }
    
  }
}