import java.util.*;
class q5
{
    public static void main(String[] abhi)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number - ");
        int n=sc.nextInt();
        int b=0,c=0;
        while(n>0)
        {
            b=n%10;
            c=c*10+b;
            n=n/10;
        }
        System.out.print(c);
    }
}