Find non-repeating characters in a string
This problem asks to find the characters in a string that appear only once, i.e., the non-repeating characters.

These characters are unique and do not appear multiple times in the string.
Example for string “swiss”:
Non-repeating characters are ‘w’ and ‘i’, since ‘s’ repeats.





import java.util.*;
class Main {
    public static void main(String[] args) {
         java.util.Scanner sc=new java.util.Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(char c:m.keySet())
        {
            if(m.get(c)==1)
            System.out.print(c);
        }
        
    }
}