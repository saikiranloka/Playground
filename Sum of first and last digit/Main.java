import java.util.Scanner;
class Main {
	public static void main (String[] args){
      
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int s,f;
     int l=n%10;
      while(n>10)
      {
        n=n/10;
      }f=n%10;
      s=f+l;
      System.out.println(s);
	}
}