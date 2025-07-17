/*Input: arr = [1, 2, 4, 5, 7, 8, 3]
Output: true
Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6]. */


public class AdjacentArray {
    public static void main(String[] args) {
       java.util.Scanner sc=new java.util.Scanner(System.in);
       int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        } 
        System.out.print(adjacent(a));
    }
    static boolean adjacent(int a[])
    {
        int k=a.length;
        //int c=0;
        for(int i=0;i<k;i++)
        {
            for(int j=1;j<k;j++)
            {
                 if((a[i]<a[j])&& (a[j]>a[j+1]))
                {
                    //c++;
                    return true;   
                }
                else if(a[k-1]>a[i])
                {
                    return true;
                }
                 
            }
        }
        return false;
    }
    }
    
//[10, 20, 15, 2, 23, 90, 80]