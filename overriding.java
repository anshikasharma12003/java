import java.util.Scanner;
class vehicle
{
public static void transports()
{
System.out.println("vehicle Showroom");
}
}
class car extends vehicle
{
public void transport()
{
System.out.println("car showroom");
}
public static void main(String args[])
{
car c = new car();
c.transport();
}
}