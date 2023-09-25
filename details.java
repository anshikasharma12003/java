import java.util.Scanner;
class employee
{
public void emp();
int empid;
float salary;
String name;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the employee id");
empid = sc.nextInteger();
System.out.println("Enter the employee name");
name = sc.nextString();
System.out.println("enter the salary");
salary = sc.nextFloat();
}
class details extends employee{
	public void main(String args())
	{
details d = new details();
d.empid();
d.name();
d.salary();
}
}