//Write a code to find consecutive largest subsequence...[100,4,200,1,3,2]

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
       System.out.print(consecutive(a,n)); 
    }
    static int consecutive(int a[],int n)
    {
        int maxlen=0;
        int count=1;
        ArrayList<Integer> al=new ArrayList<>();
        Arrays.sort(a);
        al.add(a[0]);
        for(int i=1;i<n;i++)
        {
            if(a[i]!=a[i-1])
            {
                al.add(a[i]);
            }
        }
        for(int i=1;i<n;i++)
        {
            if(al.get(i)==al.get(i-1)+1) ---(or)----|     for(int i=0;i<n-1;i++)
            {                                       |     {
                count++;                            |  		if(al.get(i)+1==al.get(i+1))
            }                                       |       	    count++;
            else                                    |     	else
            count=1;                                |                count=1;
            maxlen=(int)Math.max(maxlen,count);     |     	maxlen=(int)Math.max(maxlen,count);
        }					    |	   }
        return maxlen;
    }
}




for(int i=0;i<n-1;i++)
        {
            if(al.get(i)+1==al.get(i+1))
            {
                count++;
            }
            else
            count=1;
            maxlen=(int)Math.max(maxlen,count);
        }