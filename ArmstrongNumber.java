import java.util.Scanner;
public class ArmstrongNumber
{
public static void main(String args[])
{
int num,originalnum,rem,result=0;
Scanner s = new Scanner(System.in);
System.out.println("enter your number");
num = s.nextInt();
originalnum=num;
while(originalnum!=0)
{
rem = originalnum%10;
result += Math.pow(rem,3);
originalnum /= 10;
}
if(result == num)
System.out.println(num +" number is an armstrong number");
else
System.out.println(num +" number is not an armastrong number");
}
}