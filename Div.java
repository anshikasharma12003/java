import java.util.Scanner;
class Div
{
public static void main(String args[])
{
double num1,num2;
double result;
Scanner s = new Scanner(System.in);
System.out.println("enter the first num1: ");
num1 = s.nextDouble();
System.out.println("enter the second num2 : ");
num2 = s.nextDouble();
System.out.println("enter your choice : ");
int choice = s.nextInt();
if(choice == 0)
{
	System.out.println("num2 divides num1");
	result = num1/num2;
}
else
{
	System.out.println("default choice : ");
	System.out.println("num1 divides num2");
	result = num2/num1;
}
System.out.println("division of two numbers is : "+result);
}
}