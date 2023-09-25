import java.util.Scanner;
public class PrimeNumber
{
public static void main(String args[])
{
int i,j,isprime,n;
System.out.println("All Prime Numbers Between 1 to 100");
for(i=2;i<=100;i++)
{
isprime = 0;
{ 
for(j=2;j<=i/2;j++)
if(i%j == 0){
isprime = 1;
break;
}
}
if(isprime == 0)
System.out.println(i+" ");
}

}
}