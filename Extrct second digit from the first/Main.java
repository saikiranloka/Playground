import java.util.Scanner;
class Main {
	public static void main (String[] args){
      
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int s;
      while(n>100)
      {
        n=n/10;
      }s=n%10;
      System.out.println(s);
	}
}