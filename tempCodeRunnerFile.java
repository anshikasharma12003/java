import java.util.*;
import java.lang.*;
class remove
{
 static void removeDuplicate(String str[], int n)
{
	HashSet<String>temp = new LinkedHashSet<>(n-1);
	for(String x : str)
		temp.add(x);
	for(String x : temp)
		System.out.print(x);
}
}
public static void main(String args[])
{
	String str = "please come here here please".tocharArray();
	int n = str.length;
	removeDuplicate(str,n);
}