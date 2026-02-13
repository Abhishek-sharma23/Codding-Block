import java.util.*;
class q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit - ");
        int n=sc.nextInt();
        int a=0;
        for(int i=1;i<=n;i++)
        {
            a=a+i;
        }
        System.out.print(a);
    }
}