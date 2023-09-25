import java.util.*;
class program
{
    public static void main(String args[])
    {
        Set<String>input = new LinkedHashSet<>();
        String str = "Hello WOrld World";
        String[] words = str.split(" ");
        for(String word : words)
        {
            input.add(word);
            System.out.println(String.join("-",word));
        } 
    }
}