public class CircularQueue {
        static java.util.Scanner sc=new java.util.Scanner(System.in);
        int a[];
        int n=sc.nextInt();
        int top;
        CircularQueue()
        {
            a=new int[n];
            this.top=-1;
        }
        boolean isFull()
        {
            return top==a.length-1;
        }
        void extend()
        {
            if(top==a.length-1)
            {
                int b[]=new int[n*2];
                for(int i=0;i<a.length;i++)
                {
                    b[i]=a[i];
                }
                a=b;
            }
        }
        boolean isEmpty()
        {
            return top==-1;
        }
        void push(int val)
        {
            if(isFull())
            {
                extend();
            }
            a[++top]=val;
        }
        int pop()
        {
            if(isEmpty())
            {
                System.out.print("Queue is empty");
            }
            int k=a[0];
            return k;
    
        }
        void display()
        {
            for(int i=0;i<=top;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        public static void main(String args[])
        {
            CircularQueue q=new CircularQueue();
            q.push(10);
            q.push(20);
            q.push(50);
            q.push(30);
            q.push(60);
            q.push(70);
            q.display();
        }    
    }

