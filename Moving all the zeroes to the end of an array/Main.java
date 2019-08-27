import java.util.Scanner;
class Main 
{public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
  int i,count=0,temp;
        int a[] = new int[n];
        for( i = 0; i <n; i++)
        {
            a[i] = sc.nextInt();
        }
  for(i=0;i<n;i++)
  {
    if(a[i]!=0)
    {
      temp=a[i];
      a[i]=a[count];
      a[count]=temp;
      count++;
      
    }
   
  }
   for(i=0;i<n;i++)
  {
   System.out.print(a[i]+" ");
  }
}
}
    
    
    
    