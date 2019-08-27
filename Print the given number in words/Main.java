import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	   Scanner sc =new Scanner (System.in);
      int n=sc.nextInt();
      switch(n)
      {
        case 1:
        if(n==1)
        {
        System.out.println("One");
        break;
        }
        case 2:
        if(n==2)
        { System.out.println("Two");
        break;
        }
           case 3:
        if(n==3)
        {
        System.out.println("Three");
        break;
        }
        case 4:
        if(n==4)
        { System.out.println("Four");
        break;
        }
         
        case 5:
        if(n==5)
        { System.out.println("Four");
        break;
        }
        default:
          if(n>5)
          {
            System.out.println("Invalid");
            
          }
      }
	}
}