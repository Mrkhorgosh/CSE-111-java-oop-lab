public class CellPhone{
 public String model="unknown";
 public int stored=0;
 public String [] contacts= new String[3];
 public void printDetails(){
  System.out.println("Phone Model"+this.model);
  System.out.println("Contact Stored "+this.stored);
  for(int i=0;i<this.stored;i++){
    System.out.println(this.contacts[i]);
  }
 }
 public void storeContact(String s){
   if(stored>=this.contacts.length){
     System.out.println("Memory full. New contact can't be stored");
   }
   else{
   this.contacts[stored]=s;
   this.stored++;
   System.out.println("Contact stored");
   }
 }
}