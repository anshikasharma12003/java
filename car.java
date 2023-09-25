import java.util.Scanner;
class vehicles
{
public void transports()
{
System.out.println("vehicles Showroom");
}
}
class car extends vehicles
{
public void transports()
{
System.out.println("cars showroom");
}
public static void main(String args[])
{
car obj = new car();
obj.transports();
}
}