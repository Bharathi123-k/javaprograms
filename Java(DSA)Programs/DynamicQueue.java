 class ArrayQueue {
    static java.util.Scanner sc=new java.util.Scanner(System.in);
    int data[];
    int ds=7;
    int ptr;
    ArrayQueue()
    {
        data=new int[ds];
        this.ptr=0;
    }
    ArrayQueue(int size)
    {
    data=new int[size];
    this.ptr=0;
    }
    boolean isFull()
    {
        return ptr==data.length;
    }
    // void extend()
    // {
    //     if(ptr==a.length-1)
    //     {
    //         int b[]=new int[n*2];
    //         for(int i=0;i<a.length;i++)
    //         {
    //             b[i]=a[i];
    //         }
    //         a=b;
    //     }
    // }
    public boolean isEmpty()
    {
        return ptr==0;
    }
    public int size()
    {
        return ptr;
    }
    public int capacity()
    {
        return data.length;
    }
    public void push(int value)throws Exception
    {
        if(isFull())
        {
            throw new Exception("Queue is full");
        }
        data[ptr]=value;
        ptr++;
    }
    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty");
        }
        int k=data[0];
        for(int i=1;i<ptr;i++)
        {
            data[i-1]=data[i];
        }
        ptr--;
        return k;

    }
    void display()
    {
        for(int i=0;i<ptr;i++)
        {
            System.out.print(data[i]+" ");
        }
    }
    // public static void main(String args[]) throws Exception
    // {
    //     ArrayQueue q=new ArrayQueue();
    //     q.push(10);
    //     q.push(20);
    //     q.push(50);
    //     q.push(30);
    //     System.out.println(q.remove());
    //     // System.out.println(q.remove());
    //     q.display();
    // }    
}

//We can create dynamic size for queue also by using extends of previous class properties or we can directly create
//dynamic size in isFull() method...
class DynamicQueue extends ArrayQueue
{
    DynamicQueue()
    {
        super();
    }
    DynamicQueue(int size)
    {
        super(size);
    }
    public void push(int value)
    {
        if(isFull())
        {
            int b[]=new int[data.length*2];
            for(int i=0;i<b.length;i++)
            {
                b[i]=data[i];
            }
            data=b;
        }
        data[ptr]=value;
        ptr++;
    }
    public static void main(String args[]) throws Exception
    {
        DynamicQueue dq=new DynamicQueue();
        dq.push(60);
        dq.push(70);
        dq.push(10);
        dq.push(20);
        System.out.println(dq.remove());
        // System.out.println(q.remove());
        dq.display();
    }
}
