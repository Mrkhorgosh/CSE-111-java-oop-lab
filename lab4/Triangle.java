public class Triangle{
  int a;int b;int c;
  int p;
  Triangle ref;
  public Triangle(){
   this.ref=this;
  }
  public void updateSides(int a,int b,int c){
    this.a=a;this.b=b;this.c=c;this.p=a+b+c;
  }
  public void triangleDetails(){
    System.out.printf("Three sides of the triangle are: %d, %d, %d",a,b,c);
    System.out.println();
    System.out.println("Parimeter: "+p);
  } 
  public String  printTriangleType(){
    if(a==b && b==c){
      return "This is an Equilateral Triangle.";
    }
    else if(a!=b && b!=c)
      return "This is a Scalene Triangle.";
    else if(a==b && b!=c || b==c && a!=b || a==c && b!=c)
      return "This is a Scalene Isosceles.";
    return "";
  }
  public void compareTrinagles(Triangle t){
    if(ref.equals(t))
      System.out.println("These two triangle objects have the same address.");
    else  if(t.a==a && t.b==b && t.c==c){
      System.out.println("Addresses are different but the sides of the triangles are equal.");
    }
    else if(t.a!=a && t.b!=b && t.c!=c && t.p!=p){
      System.out.println("Addresses, length of the sides and perimeter all are different.");
  }
    else if(t.a!=a && t.b!=b && t.c!=c && t.p==p){
      System.out.println("Only the perimeter of both triangles is equal.");
  }
  }
}