import java.util.*;
class q26
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr Number - ");
        int n=sc.nextInt();
        int a=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                a++;
            }
        }
        System.out.print(a);
    }
}