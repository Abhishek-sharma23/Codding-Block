import java.util.*;
class q21
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr Number - ");
        int n=sc.nextInt();
        int largest=0;
        int ls=0;
        int a=n;
        while(n>0)
        {
            ls=n%10;
            if(largest<ls)
            {
                largest=ls;
            }
            n=n/10;
        }
        System.out.print("Largest Number Is - "+largest);
    }
}