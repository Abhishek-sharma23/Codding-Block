import java.util.*;
class q6
{
    public static void main(String[] abhi)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit - ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}