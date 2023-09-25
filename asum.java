import java.util.Scanner;
class asum
{
     public static void main(String[] args)
    {
        int a , b , sum=0;
        Scanner S = new Scanner(System.in);
        System.out.println("enter the value of a ");
        a = S.nextInt();
        System.out.println("enter the value of b ");
        b = S.nextInt();
        sum= a+b;
        System.out.println("sum of a and b is :"+sum);

    }
}