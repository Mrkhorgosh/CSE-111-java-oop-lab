public class TaxiLagbe{
  String taxiNum;
  String location;
  int passCount;
  int passLim=4;
  int fare;
  String passList="";
  public void storeInfo(String taxiNum,String location){
    this.taxiNum=taxiNum;
    this.location=location;
  } 
  public void printDetails(){
    System.out.println("Taxi number: "+taxiNum);
    System.out.println("This taxi can cover Dhaka area");
    System.out.println("Total Passenger: "+passCount);
    System.out.println("Total collected fare: "+fare+" Taka");
    System.out.println("Passanger List");
    if(passCount>0)
      System.out.println(passList);
  }
  public void addPassenger(String n1,int f1 ){
    if(passCount<passLim){
      this.passList+=n1+" ";
      this.fare+=f1;
      System.out.printf("Dear %s! Welcome to TaxiLagbe",n1);
      System.out.println();
      passCount++;
    }
    else{
      System.out.println("Taxi Full! No more passengers can be added");
    }
  }
    public void addPassenger(String n1,int f1,String n2, int f2){
     if(passCount+1<passLim){
      this.passList+=n1+" "+n2+" ";
      this.fare+=f1+f2;
      System.out.printf("Dear %s! Welcome to TaxiLagbe",n1);
      System.out.println();
      System.out.printf("Dear %s! Welcome to TaxiLagbe",n2);
      System.out.println();
      passCount+=2;
    }
     else{
      System.out.println("Taxi Full! No more passengers can be added");
    }
  }
}