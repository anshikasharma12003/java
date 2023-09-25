import java.util.Scanner;
class OddNumber
{
public static void main(String args[])
{
int num;
Scanner s =  new Scanner(System.in);
System.out.println("enter the numbers : ");
num = s.nextInt();
if(num%2!=0)
System.out.println("given number is odd number : ");
else
	System.out.println("given number is not an odd number : ");
System.out.println(num);
}
}