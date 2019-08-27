import java.util.Scanner;
class Main{
    public static void main(String args[]){
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int k=-1;
      int  l=-1;
       int n1=sc.nextInt();
      int n2=sc.nextInt();
       for(i=0;i<n;i++)
      {
         if(n1==a[i])
         {
           k=i;
           break;
         }
        
       } 
      for(i=0;i<n;i++)
      {
      if(n2==a[i])
         {
           l=i;
        break;
         }
      } 
      System.out.println(k);
       System.out.println(l);
    }
}