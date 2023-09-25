import java.util.Scanner;
class overloading
{
public static void disp(char c)
{
//display overloading means parameters
System.out.println(c);
}
public void disp(char c , int num)
{
System.out.println(c+""+num);
}
}
class Sample
{
public static void main(String args[])
{
overloading obj = new overloading();
obj.disp('a');
obj.disp('a',10);
}
}