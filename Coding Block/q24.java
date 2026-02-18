import java.util.*;
class q24
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr Number - ");
        int n=sc.nextInt();
        int largest=0,p=1;
        int a=n;
        while(n>0)
        {
            largest=n%10;
            p=p*largest;
            n=n/10;
        }
        System.out.print(p);
    }
}