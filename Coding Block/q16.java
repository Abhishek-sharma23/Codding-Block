import java.util.*;
class q16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit - ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((j==1 || i==1 || j==n || i==n)?"* ":"  ");
            }
            System.out.println();
        }
    }
}