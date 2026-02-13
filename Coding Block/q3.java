import java.util.*;
class q3
{
    public static void main(String[] abhi)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number - ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print("Factorial is - "+fact);
    }
}