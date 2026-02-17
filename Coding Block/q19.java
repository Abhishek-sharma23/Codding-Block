import java.util.*;
class q19
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number - ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        // for(int i=1;i<=n;i++)
        // {
        //     if(i<=n/2)
        //     {
        //         for(int j=1;j<=i;j++)
        //         {
        //             System.out.print("* ");
        //         }
        //         else
        //         {
        //             for(int j=1;j<=n-i+1;j++)
        //             {
        //                 System.out.print("* ");
        //             }
        //         }
        //         System.out.println();
        //     }
        // }
    }
}