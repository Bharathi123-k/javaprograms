Automorphic number...



import java.util.*;
class Main {
    public static void main(String[] args) {
         java.util.Scanner sc=new java.util.Scanner(System.in);
         //char ch=sc.next().charAt(0);
        int n=sc.nextInt();
        int temp=n*n;
        int t=n;
        int c=0;
        while(t>0)
        {
            t=t/10;
            c++;
        }
        int mod=(int)Math.pow(10,c);
        int res=temp%mod;
        if(res==n)
        System.out.print("yes");
        else
        System.out.print("no");
        
    }
}