import java.util.Scanner;
class Main{
  public static int  power(int b,int e)
  {
    int power=1;
    while(e>0)
    {
        power=power*b;
        e--;
    }
    return power;
    
  }
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int c=power(n1,n2);
      System.out.println(c);
	}
}