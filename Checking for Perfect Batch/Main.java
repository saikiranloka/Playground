import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum1=0;
    int a[]=new int[n];
    int i,k=0,s=0;
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
int sum=a[0]+a[1]+a[2];
    for(i=3;i<n;i=i+3)
    {
      sum1=a[i]+a[i+1]+a[i+2];
    }
      if(sum==sum1)
      {
        System.out.println("Perfect Batch");
      }
      else
      {
        System.out.println("Not a Perfect Batch");
      }
    
  }
}