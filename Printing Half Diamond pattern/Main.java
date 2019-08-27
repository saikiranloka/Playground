import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,s,j;
      for(i=1;i<=n;i++)
      {
        for(s=1;s<=n-i;s++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=2*i-1;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
	}
}