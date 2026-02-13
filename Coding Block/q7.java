import java.util.*;
class q7
{
    public static void main(String[] abhi)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Year - ");
        int n=sc.nextInt();
        System.out.print((n%4==0 && n%100!=0 || n%400==0)?"Its a leap year":"Its not a leap year");

    }
}