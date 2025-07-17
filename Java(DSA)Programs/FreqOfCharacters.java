Write code to Calculate frequency of characters in a string
This problem asks to calculate the frequency of each character in a given string.

The goal is to determine how many times each character appears in the string.
Example for string “hello”:
‘h’ appears 1 time
‘e’ appears 1 time
‘l’ appears 2 times
‘o’ appears 1 time





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
        for(Map.Entry<Character,Integer> e:m.entrySet())
        {
            System.out.println(e.getKey()+"-->"+e.getValue());
        }
        
    }
}