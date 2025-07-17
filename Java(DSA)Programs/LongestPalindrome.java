Longest palindrome in given String array...

import java.util.*;
class Main {
    public static void main(String[] args) {
         java.util.Scanner sc=new java.util.Scanner(System.in);
       //int n=sc.nextInt();
       String s[]={"racecar","level","hello","madam","world","mamamamam"};
       int len=0;
       String temp="";
       for(int i=0;i<s.length;i++)
       {
           String t=s[i];
           if(palindrome(t))
           {
               if(s[i].length()>len)
               {
                   len=s[i].length();
                   temp=s[i];
               }
           }
       }
       System.out.print(temp);
        
    }
    static boolean palindrome(String str)
    {
        String p="";
        for(int i=0;i<str.length();i++)
        {
            p=str.charAt(i)+p;
        }
        if(p.equals(str))
        {
            return true;
        }
        else
        return false;
    }
}