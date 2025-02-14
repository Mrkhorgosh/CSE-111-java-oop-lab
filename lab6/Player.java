public class Player{
  public static int total;
  public static String pl="";
  String name;
  int j;
  String c;
  
  public Player(String name,String c,int j){
    this.j=j;this.name=name;this.c=c;
    total++;
    if(total==1)
      pl+=name;
    else
      pl+=", "+name;
  }
  
  public String player_detail(){
    return "Player Name: "+name+"\nJersey Number: "+j+"\nCountry: "+c;
  }
  
  public static void info(){
    System.out.println("Total number of players: "+total+"\nPlayers enlisted so far: "+pl);
  }

}