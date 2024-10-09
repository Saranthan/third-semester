import java.util.*;
class queue
{
static public int front,rear,capacity;
static public int[] queue;
public static void main(String [] arr)
{
int front=0;
int rear=0;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the capacity of the queue");
int c = sc.nextInt();
capacity=c;
queue=new int[capacity];
queue obj=new queue();
while(true)
{
System.out.println("\n1.Enqueue\n2.Display\n3.Dequeue\n4.Quit");
int b=sc.nextInt();
switch (b)
{
case 1:
obj.enqueue();
break;
case 2:
obj.display();
break;
case 3:
obj.dequeue();
break;
case 4:
System.exit(0);
default:
System.out.println("Wrong Option");
}
}}
public static void enqueue()
{
if (rear==capacity)
{
System.out.println("The queue is full");
}
else
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the element want to add:");
int get=scan.nextInt();

queue[rear]=get;
rear+=1;
System.out.println("The adding position "+rear+" is" +get);
}
}
public static void display()
{
for (int i=0;i<queue.length;i++)
{
System.out.print(queue[i]+"<----");
}
}
public static void dequeue()
{
if (front==rear)
{
System.out.println("The queue is empty");
}
else
{
for (int i=0;i<rear-1;i++)
{
queue[i]=queue[i+1];

}
}
}
}