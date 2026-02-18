import java.util.*;
class q28
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr Number - ");
        int n=sc.nextInt();
        int count=0;
        int root=(int)Math.sqrt(n);
        if(root*root==n)
        {
            System.out.print("Its Perfect Square");
        }
        else
        {
            System.out.print("Its Not");
        }
    }
}