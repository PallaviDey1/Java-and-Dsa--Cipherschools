package queue;


class CircularQueue {
	final int size=10;
	int arr[]=new int[size];
	int front = -1;
	int rear = -1;
	
	boolean isEmpty()
	{
		return (front==-1 && rear==-1);
	}
	
	int peek() 
	{
		if(this.isEmpty())
		{
			System.out.println("Empty queue !! Nothing  at front");
			return -1;
		}
		return arr[front];
	}
	
	void enqueue(int data)
	{
		
		if(front==(rear+1)%size)
		{
			System.out.println("Queue  is full! cannot enqueue");
			return;
		}
		if(this.isEmpty())
			
		{
			front++;
		}
		
		
		rear= (rear+1)%size;
		arr[rear]=data;
		
	}
	
	int dequeue()
	{
		if(this.isEmpty())
		{
			System.out.println("Empty Queue !! Nothing to dequeue");
			return -1;
		}
		if(front==rear)
		{
			int x=arr[front];
			front=-1;
			rear=-1;
		    return x;
		}
		int x= arr[front];
		front=(front+1)%size;
		return x;
		
	}

}
public class CircularClass{
	public static void main(String[]args)
{ 
		CircularQueue q= new CircularQueue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(14);
		q.enqueue(14);
		
		
		


		
		}
}


