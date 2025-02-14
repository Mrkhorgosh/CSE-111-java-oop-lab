public class  BracuBus{
  String d; int cap=2;int p;
  String pb="";
  public BracuBus(String d){
    this.d=d;
  }
  public BracuBus(String d,int cap){
    this.d=d;this.cap=cap;
  }
  public void showDetails(){
    System.out.println("Bus Route: "+d);
    System.out.println("Passenger Count: "+p+" (Max: "+cap+")");
    System.out.println("Passengers on Board: "+pb); 
  }
  public void board(){
      System.out.println("No passengers");
  }
  public void board(BracuStudent st){
    if(cap-p>=1){
     if(st.pass==false)
       System.out.println("You don't have a bus pass!");
     else if(st.d!=this.d)
       System.out.println("You got on the wrong bus!");
     else{
       System.out.println(st.n+"Boarded the bus");
       this.pb+=st.n+" ";
       p++;
     }
    }
    else
      System.out.println("Bus is full");
  }
   public void board(BracuStudent st,BracuStudent st1){
    if(cap-p>=1){
     if(st.pass==false)
       System.out.println("You don't have a bus pass!");
     else if(st.d!=this.d)
       System.out.println("You got on the wrong bus!");
     else{
       System.out.println(st.n+"Boarded the bus");
       this.pb+=st.n+" ";
       p++;
     }
    }
    else
      System.out.println("Bus is full");
    
    if(cap-p>=1){
     if(st1.pass==false)
       System.out.println("You don't have a bus pass!");
     else if(st1.d!=this.d)
       System.out.println("You got on the wrong bus!");
     else{
       System.out.println(st1.n+"Boarded the bus");
       this.pb+=st1.n+" ";
       p++;
     }
    }
    else
      System.out.println("Bus is full");
  }
}