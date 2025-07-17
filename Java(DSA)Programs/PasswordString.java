class PasswordString
{
public static void main(String[]args)
{

    //Write Your Code Here
    java.util.Scanner sc=new java.util.Scanner(System.in);
    String s=sc.nextLine();
    int k=s.length();
    String p="";
    int c=0;
      int a=0;
        if(k>=15 && k<=25)
        {
            for(int i=0;i<k;i++)
            {
                a=i;
                String t="";
                char ch=s.charAt(i);
                if(ch>='A'&&ch<='Z')
                {
                    t=t+s.charAt(i);
                }
                if(ch!='@')
                {
                    if(s.startsWith(t)||(ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='1'&&ch<='9')||ch=='_'||ch=='.')
                    {
                        p=p+ch;
                        c++;
                    }
                }
                else
                {
                    p=p+ch;
                    break;
                }
            }
            int b=0;
            for(int i=a+1;i<k;i++)
            {
                b=i;
                char ch=s.charAt(i);
                if(ch=='@'||(ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='1'&&ch<=9))
                {
                    p=p+ch;
                    c++;
                }
                else if(ch=='.')
                {
                    p=p+ch;
                    break;
                }
            }
            for(int i=b+1;i<k;i++)
            {
                char ch=s.charAt(i);
                if(ch=='.'||(ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
                {
                    p=p+ch;
                    c++;
                }
            }
        }
        if(p.equals(s))
            {
                System.out.print("Valid");
            }
            else
            System.out.print("Invalid");

}
}

//ColleGe@JNTU.2co34m