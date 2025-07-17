//Write a code to find consecutive largest subsequence without dsa....


import java.util.*;
class Main {
    public static void main(String[] args) {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int n=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
       a[i]=sc.nextInt();
   }
   Arrays.sort(a);
   int len=0;
   int count=1;
   for(int i=0;i<n-1;i++)
   {
       if(a[i]+1==a[i+1])
       {
           count++;
           if(count>len)
           {
               len=count;
           }
       }
       else
        count=1;
   }
   System.out.print(len);
    }
}