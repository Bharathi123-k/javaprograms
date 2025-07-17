public class Keith {
    static java.util.Scanner sc=new java.util.Scanner(System.in);
    public static void main(String args[])
    {
         int n=sc.nextInt();
         int t=n,c=0;
         while(t>0)
         {
            t=t/10;
            c++;
         }
         int a[]=new int[c];
         t=n;
         int idx=0;
         while(t>0)
         {
            int r=t%10;
            a[idx]=r;
            idx++;
            t=t/10;
         }
         int k=0;
         while(k<n)
         {
            for(int i=0;i<n;i++)
            {
                 k=k+a[i];

            }
            for(int i=0;i<n-1;i++)
            {
                a[i]=a[i+1];
            }
            a[n-1]=k;
            if(k==n)
            {
                System.out.print("keith number");
            }
        }
    }
    
}
