public class BankAccount {
  int accountN;
  String type="Not set";
  
  public String printDetails(){
    return "Accoun NO : "+accountN+"\nType: "+type;
  }
  public void setInfo(int accountN, String type){
    this.accountN=accountN;
    this.type=type;
    System.out.println("Account information updated!");
  }
}