import java.util.*;
class q8
{
    public static void main(String[] abhi)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit - ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.print("Its Prime");
        }
        else
        {
            System.out.print("Its Not Prime");
        }
    }
}