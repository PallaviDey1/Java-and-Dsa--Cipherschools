package priorityQueueAndHeaps;

import java.util.PriorityQueue;

class PQarray{
	final int size= 10;
	int arr[]= new int[size];
	int nItems=0;
	
	void add(int data)
	{
		if(isEmpty())
		{
			arr[0]=data;
			nItems++;
			return;
		}
		int i;
		
		
		for( i=nItems-1;i>=0;i++)
		{
			if(data<arr[i])
			{
				arr[i+1]=arr[i];
			}
			else
			{
				
				break;
			}
			
		}
		arr[i+1] = data;
		nItems++;
	}
	
	int poll()
	{
		//int temp = arr[nItems -1];
		//nItems= nItems-1;
		//return temp;
		//return arr[nItems], nItems =nItems-1;
		return arr[--nItems];
		
	}
	
	int peek()
	{
		if(isEmpty() ) return -1;
		return arr[nItems -1];
	}
	
	boolean isEmpty()
	{
	return nItems==0;	
	}
	
	int size()
	{
		return nItems;
	}
}


public class ArrayImpl {

	public static void main(String[] args) {
		PQarray pq = new PQarray();
		System.out.println(pq.isEmpty());
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		pq.add(6);
		System.out.println(pq.isEmpty());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.size());
		

	}

}
