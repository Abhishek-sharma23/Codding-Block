import java.util.*;
class q20
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number - ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=2*i;k++)
            {
                System.out.print("* ");
            }
            for(int l=1;l<=n-i+1;l++)
            {
                System.out.print(" tcnm. ");
            }
            System.out.println();
        }
    }
}