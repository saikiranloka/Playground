import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i,k=0,s=0;
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(a[i]>k)
      {k=a[i];
        s=i;
      }
    }
    System.out.println(s);
  }
}