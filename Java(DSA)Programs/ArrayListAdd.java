public class ArrayListAdd {
    static java.util.Scanner sc=new java.util.Scanner(System.in);
    int a[],size;
    ArrayListAdd()
    {
        a=new int[10];
        size=0;
    }
    
    public void add(int n)
    {
        isFull();
            a[size]=n;
            size++;
    }
    public void isFull()
    {
        if(size==a.length)
        {
            int b[]=new int[size+(size/2)];
            for(int i=0;i<size;i++)
            {
                b[i]=a[i];
            }
            a=b;
        }
    }
    public void addAt(int index, int value)
    {
        if(index>0 && index<size)
        {
            for(int i=size;i>=index;i--)
            {
                a[i]=a[i-1];
                if(i==index)
                {
                    a[i]=value;
                }
            }
        }
    }
    public int get(int idx)
    {
        int ele=0;
        if(idx>0 && idx<size)
        {
            for(int i=0;i<size;i++)
            {
                if(i==idx)
                {
                    ele=a[i];
                }
            }
        }
        return ele;
    }
    public void display()
    {
        for(int i=0;i<=size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public void set(int idx, int val)
    {
        if(idx>0&&idx<size)
        {
            for(int i=0;i<size;i++)
            {
                if(i==idx)
                {
                    a[i]=val;
                }
            }
        }
    }
    public boolean isEmpty()
    {
        if(size==0)
        {
            return false;
        }
        else
        return true;
    }
    public int remove(int idx)
    {
        int ele=0;
        if(idx>0&&idx<size)
        {
            for(int i=0;i<size;i++)
            {
                if(i==idx)
                {
                    ele=a[i];
                    //a[i]=a[i+1];    
                }
                a[i]=a[i+1];   
            }
        }
        return ele;
    }
    public static void main(String args[])
    {
        ArrayListAdd al=new ArrayListAdd();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        al.addAt(3,30);
        al.set(1,10);
        al.display();
        System.out.println();
        System.out.println(al.get(4));
        System.out.println(al.isEmpty());
        System.out.println(al.remove(5));
    }
    
}
