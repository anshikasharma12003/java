import java.util.Scanner;
class Fibonacci
{
public static void main(String args[])
{
int num1=0,num2=1,n=25;
System.out.println("Fibonacci Series");
for(int i=1;i<=n;i++)
{
System.out.print(num1+",");
int nextterm = num1+num2;
num1=num2;
num2=nextterm;
}
}
}