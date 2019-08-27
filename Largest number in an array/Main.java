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
      int k=0;
   
       for(i=0;i<n;i++)
      {
         if(a[i]>k)
         {
           k=a[i];
         
         }
        
      } 
 
       System.out.println(k);
    }
}