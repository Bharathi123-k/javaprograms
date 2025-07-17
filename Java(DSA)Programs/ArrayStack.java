//import java.util.*;
public class ArrayStack {
    int data[];
    int top;
    int datasize=7;
    //optional...//
    int ptr;
    ArrayStack()
    {
        this.data=new int[datasize];
        this.top=-1;
        this.ptr=0;
    }
    ArrayStack(int size)
    {
        this.data=new int[size];
        this.top=-1;
        int ptr=0;
    }
    public boolean isFull()
    {
        extendsCap();//call method if only for dynamic size creation purpose...
        return top==data.length-1;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public int size()
    {
        return top;
        //return ptr;
    }
    public int capacity()
    {
        return data.length;
    }
    public void extendsCap()
    {
        if(top==data.length-1)//or if(ptr==data.length)
        {
            int b[]=new int[data.length*2];
            for(int i=0;i<b.length;i++)
            {
                b[i]=data[i];
            }
            data=b;
        }
    }
    public void push(int value) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Stack is full");
        }
        top++;
        data[top]=value;
        //data[ptr]=value;
        //ptr++;
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is empty");
        }
        int k=data[top];
        data[top]=0;
        top--;
        return k;
        /* ptr--;
        int k=data[ptr];
        return k; */
    }
    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is empty");
        }
        return data[top];
        //return data[ptr-1];
    }

    //WAP to implement a method which inserts elemnet at the bottom in the stack..
    public void insertAtBottom(ArrayStack data,int value) throws Exception
    {
        if(data.isEmpty()){
            data.push(value);
            return;
        }
        int k=data.pop();
        insertAtBottom(data,value);
        data.push(k);

    }
    //Implement a method to reverse the stack...
    public void reverse(ArrayStack data) throws Exception
    {
        if(isEmpty())
        {
            return;
        }
        int k=data.pop();
        reverse(data);
        insertAtBottom(data,k);

    }
    public void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(data[i]+" ");
        }
        /* for(int i=0;i<ptr;i++)
         {
           System.out.print(data[i]+" ");
         } 
         */
    }
    public String toString()
    {
        String s="[";
        for(int i=0;i<=top;i++)//for(int i=0;i<ptr;i++)
        {
            if(i!=0)
            {
                s=s+", ";
            }
            s=s+data[i];
        }
        return s+"]";
    }
    public static void main(String args[]) throws Exception
    {
        ArrayStack as=new ArrayStack();
        as.push(10);
        as.push(30);
        as.push(50);
        as.push(20);
        as.pop();
        System.out.println(as.peek());
        as.push(100);
        System.out.println(as.size());
        System.out.println(as.toString());
        as.insertAtBottom(as,80);
        as.reverse(as);
        as.display();
        

    }

}
//We can also create dynamicStack by extending above mentioned properties into a DyanamicStack class, that is by overriding push method and extending the size...
