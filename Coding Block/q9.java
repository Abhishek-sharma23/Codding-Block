import java.util.*;
class q9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<=n;i++)
        {
            int count=0;
           for(int j=1;j<=i;j++)
           {
                if(i%j==0)
                {
                    count++;
                }
           }
           if(count==2)
           {
               System.out.println(i+" is a prime num");
               c++;
           }
        }
        System.out.println("Total Prime Number Are - "+c);
    }
}