import java.util.Scanner;
class Main{
  public static int greatest(int n1,int n2, int n3)
  {
    int x=0;
    if(n1>n2)
    {
      x=n1;
    }
    else if(n2>n3)
    {
      x=n2;
    }
    else
    {
      x=n3;
    }
 return x;
  }

	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
    int k= greatest(n1,n2,n3);
      System.out.println(k);
	}
}