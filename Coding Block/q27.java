import java.util.*;
class q27
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr 1st Number - ");
        int a=sc.nextInt();
        System.out.print("Enetr 2nd Number - ");
        int b=sc.nextInt();
        while(b>0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.print("GCD - "+a);
    }
}