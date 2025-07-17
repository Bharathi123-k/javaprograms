class AntiRotationString
{
    public static void main(String args[])
    {
        //Write your code here.
        java.util.Scanner sc=new java.util.Scanner(System.in);
        String s=sc.nextLine();
        int k=s.length();
        if(k<3)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            char c[]=s.toCharArray();
            int l=c.length;
            for(int i=0;i<c.length;i++)
            {
                char ch=c[l-1];
                for(int j=c.length-1;j>0;j--)
                {
                   c[j]=c[j-1];
                   
                }
                c[0]=ch;
                for(int j=0;j<c.length;j++)
                {
                    System.out.print(c[j]+" ");
                }
                System.out.println();      
            }
        }
            
        
    }
}
