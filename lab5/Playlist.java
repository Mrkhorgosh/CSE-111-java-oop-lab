public class Playlist{
  String name;
  Song firstSong;
  Song addCopy;
  public Playlist(String name){
    this.name=name;
    System.out.println(name+" created");
  }
  public void info(){
   System.out.println("First playlist has the following Songs");
   if(firstSong==null)
     System.out.println("No songs in "+name);
   else{
     System.out.println("songs :");
     Song copy=firstSong;
     int count=1;
     while(copy!=null){
       System.out.println("Song-"+count); 
       copy.songInfo();
       copy=copy.nextSong;
       count++;
     }
   }
  }
  public void addSong(Song s){
    if(firstSong==null){
      firstSong=s;
      addCopy=firstSong;
    }
    else{
      addCopy.nextSong=s;
      addCopy=addCopy.nextSong;
    }
    System.out.println(s.title+" added to "+name);
  }
  public void addSong(Song s,int ind){
    if(ind==10)
      System.out.println("Cannot add song to Index 10.");
    else if(ind==0) {
    s.nextSong=firstSong;
    firstSong=s;
    }
    else{
      Song temp=firstSong;
      for(int i=1;i<ind;i++){
        temp=temp.nextSong;   
      }
      s.nextSong=temp.nextSong;
      temp.nextSong=s;
    }
  }
  public void playSong(String s){
    Song temp=firstSong;
    boolean check=false;
    while(temp!=null){
      if(temp.title.equals(s)){
        System.out.println("Playing "+temp.title+" by "+temp.artist+".");
        check=true;
        break;
      }
      temp=temp.nextSong;
    }
    if(check==false)
      System.out.println(s+" not found  in playlist "+this.name+".");
  }
  public void playSong(int ind){
    Song temp=firstSong;
    int c=0;
    boolean check=true;
    while(c<ind){
      if(temp==null){
        System.out.println("Song at Index "+ind+" not found in First Playlist.");
        check=false;
        break;
      }
      temp=temp.nextSong;
      c++;
    }
    if(check==true){
    System.out.println("Playing "+temp.title+" by "+temp.artist);
    }
  }
  public void deleteSong(String s){
    boolean check=false;
    if(firstSong.title.equals(s)){
      System.out.println(firstSong.title+" deleted from "+name+".");
      firstSong=firstSong.nextSong;
      check=true;
    }
    else{
      Song temp=firstSong;
      Song temp1=null;
    while(temp!=null){
      if(temp.title.equals(s)){
        temp1.nextSong=temp.nextSong;
        System.out.println(temp.title+" deleted from "+name+".");
        check=true;
        break;
      }
      temp1=temp;
      temp=temp.nextSong;
    }
    if(check==false)
      System.out.println(s+" not found  in playlist "+this.name+".");
    }
  }
  public int totalSong(){
    int count =0;
    Song temp=firstSong;
    while (temp!=null){
     temp=temp.nextSong;
     count++;
    }
    return count;
  }
  public void merge(Playlist p){
    Song temp=firstSong;
    Song temp1=null;
    while(temp!=null){
      temp1=temp;
      temp=temp.nextSong;
    }
    Song temp2=p.firstSong;
    while(temp2!=null){
      temp1.nextSong=temp2;
      temp2=temp2.nextSong;
      temp1=temp1.nextSong;
    }
    System.out.println("Merge Completed!"); 
  }
}