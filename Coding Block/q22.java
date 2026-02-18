import java.util.*;
class q22
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number - ");
        int n=sc.nextInt();
        int rev=0,ld;
        int a=n;
        while(n>0)
        {
            ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        if(rev==a)
        {
            System.out.print("Its Palindrome");
        }
        else
        {
            System.out.print("Its Not");
        }
    }
}