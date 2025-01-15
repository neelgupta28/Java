//program for queue using linked list
import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Queue
{
    Node front,rear;
    Queue()
    {
        front=rear=null;
    }
    void enqueue(int data)
    {
        Node temp=new Node(data);
        if(rear==null)
        {
            front=rear=temp;
            return;
        }
        rear.next=temp;
        rear=temp;
    }
    void dequeue()
    {
        if(front==null)
        {
            System.out.println("Queue is empty");
            return;
        }
        Node temp=front;
        front=front.next;
        if(front==null)
        {
            rear=null;
        }
    }
    void display()
    {
        Node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class queueusinglinkedlist
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue();
        int ch;
        do
        {
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the element to be inserted:");
                    int ele=sc.nextInt();
                    q.enqueue(ele);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch!=4);
    }
}
