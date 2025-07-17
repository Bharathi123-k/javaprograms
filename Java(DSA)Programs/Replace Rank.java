Write a code to replace each element in an array by its rank in the array
This problem asks to replace each element in an array by its rank in the array.

The rank of an element is its position in the sorted array (with ties assigned the same rank).
Example for array [40, 10, 20, 30]:
After replacing each element by its rank, the array will be [4, 1, 2, 3] (after sorting, the elements are [10, 20, 30, 40], so ranks are [1, 2, 3, 4]).




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
        int sorted[]=Arrays.copyOf(a,n);
        Arrays.sort(sorted);
        Map<Integer,Integer> m=new HashMap<>();
        int rank=1;
        for(int i=0;i<n;i++)
        {
            m.put(sorted[i],rank);
            while(i<n-1 && sorted[i+1]==sorted[i])
            {
                m.put(sorted[i+1],rank);
                i++;
            }
            rank++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]=m.get(a[i]));
        }
        
    }
}