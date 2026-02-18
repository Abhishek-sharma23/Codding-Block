import java.util.*;
class q25
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr Number - ");
        int n=sc.nextInt();
        int a=0,b=0,c=0;
        while(n>0)
        {
            a=n%10;
            if(a%2==0)
            {
                b=b+a;
            }
            else 
            {
                c=c+a;
            }
            n=n/10;
        }
        System.out.println("Sum of Odd Numbers - "+c);
        System.out.print("Sum Of Even Numbers - "+b);
    }
}