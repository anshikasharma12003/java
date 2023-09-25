import java.util.Scanner;
import java.lang.*;
class removeduplicate
{
    void removeduplicate();
    void remove(String str)
    {
        String newstr = new String();
        int length = str.length();
        for (int i=0;i<length;i++)
        {
            final char charAtPosition = str.charAt(i);
            if(newstr.indexOf(charAtPosition)< 0)
            {
                newstr += charAtPosition;
            }
        }
    }
        System.out.println(newstr);
    }
    int main()
    {
        public void main(String[] args)
        {
            String str = "please come here please some work for you here";
            remove(str);
        }
        public String toString() {
            return "removeduplicate []";
        }

    }