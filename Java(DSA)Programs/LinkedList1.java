// java.lang.Throwable;
class CustomException extends RuntimeException{
    CustomException(String m)
    {
        super(m);
    }
}
public class LinkedList1<Custom> {
    Node head;
    Node tail;
    int size;
    LinkedList1()
    {
        this.size=0;
    }
    class Node{
        Custom value;
        Node next;
        Node(Custom value)
        {
            this.value=value;
            this.next=null;
        }
    }
    public void add(Custom val)
    {
        Node n=new Node(val);
        if(head==null)
        {
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void addFirst(Custom val)
    {
        Node n=new Node(val);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else{
            n.next=head;
            head=n;
        }
        size++;
    }
    public void addLast(Custom val)
    {
        Node n=new Node(val);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
        size++;
    }
    public void addAtIndex(int idx, Custom val)
    {
        if(idx<0||idx>=size)
        {
            throw new CustomException("Index Out of bounds");
        }
        else if(idx==0)
        {
            addFirst(val);
        }
        else{
            Node n=new Node(val);
            Node temp=head;
            for(int i=1;i<idx;i++)
            {
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }  
    }
    public Custom removeFirst()
    {
        if(head==null)
        {
            throw new CustomException("list is empty");
        }
        else if(head.next==null){
            Custom k=head.value;
            head=null;
            tail=null;
            size--;
            return k;
        }
        else{
            Custom k=head.value;
            head=head.next;
            size--;
            return k;
        }
    }
    public Custom removeLast()
    {
        if(head==null)
        {
            throw new CustomException("List is empty");
        }
        else if(head.next==null)
        {
            Custom k=head.value;
            head=null;
            tail=null;
            size--;
            return k;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
            Custom k=tail.value;
            tail=temp;
            size--;
            return k;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        LinkedList1<Integer> l=new LinkedList1<>();
        // l.add(30);
        // l.add(50);
        // l.add(10);
        l.addFirst(70);
        l.addLast(140);
        l.addLast(50);
        l.addLast(10);
        l.addAtIndex(2,80);
        l.addLast(150);
        System.out.println(l.removeFirst());
        l.add(100);
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        l.display();
    }
}
