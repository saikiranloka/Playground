import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,s,j,num=1;
      for(i=1;i<=n;i++)
      {
        for(s=1;s<=n-i;s++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
          System.out.print(num+" ");
          num=num+1;
        }
        System.out.println();
      }
	}
}