public class FibNearestArray {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ff=0,bf=0,fd=0,bd=0;
        for(int i=0;i<n;i++)
        {   
            int a=0,b=1;
            
            for(int j=arr[i];j>0;j--)
            {
                
                while(b<arr[i])
                {
                    int c=a+b;
                    a=b;
                    b=c;
                }
                if(a<arr[i])
                {
                    bf=a;
                    break;
                }
            }
            int d=0,e=1;
            for(int j=arr[i]; ;j++)
            {
                if(d>arr[i])
                {
                    ff=d;
                    break;
                }
                int c=d+e;
                d=e;
                e=c;
            }
            bd=arr[i]-bf;
            fd=ff-arr[i];
            if(arr[i]==0)
            {
                System.out.println(ff);

            }
            else if(arr[i]==1)
            {
                System.out.println(bf+" "+"1");
            }
            else
            {
                if(fd<bd)
                {
                    System.out.println(ff);
                }
                else if(fd>bd)
                {
                    System.out.println(bf);
                }
                else
                {
                    System.out.println(bf+" "+ff);
                }
            }
        }
    }
}
