import java.util.Scanner;
class Sub
{
public static void main(String args[])
{
int num1,num2,diff;
Scanner s = new Scanner(System.in);
System.out.println("enter the first num:");
num1 = s.nextInt();
System.out.println("enter the second num:");
num2 = s.nextInt();
if(num1<=num2)
{
 diff = num2-num1;
}
else
{
diff = num1-num2;
}
System.out.println("the difference between num1 and num2: " +diff);
}
}