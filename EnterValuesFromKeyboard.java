import java.util.Scanner;
class conversion
{
	public static void main(String args[])
	{
		int a;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println(""enter first value");
		a = Integer.parseInt(d.readLine());
		System.out.println("enetr second value");
		int b = Integer.parseInt(d.readLine());
		c = a+b;
		System.out.println(+c);
	}
	
}