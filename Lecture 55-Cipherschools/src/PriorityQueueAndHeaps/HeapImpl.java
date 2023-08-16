package PriorityQueueAndHeaps;
class MyHeap{
	final int capacity = 10;
	int arr[]=new int[capacity];
	int size =0;
	
	int getParentIndex(int i)
	{
		return(i-1)/2;
	}
	int getLeftChildIndex(int i)
	{
		return 2*i+1;
	}
	int getRightChildIndex(int i)
	{
		return 2*i+2;
	}
	
	boolean hasParent(int i)
	{
		return getParentIndex(i)>=0;
	}
	boolean hasLeftChild(int i)
	{
		return getLeftChildIndex(i)<size;
	}
	boolean hasRightChild(int i)
	{
		return getRightChildIndex(i)<size;
	}
	
	int parent(int i)
	{
		return arr[getParentIndex(i)];
	}
	int leftChild(int i)
	{
		return arr[getLeftChildIndex(i)];
	}
	int rightChild(int i)
	{
		return arr[getRightChildIndex(i)];
	}
	boolean isEmpty()
	{
		return size==0;
	}
	
	int peek()
	{
		if(isEmpty())
		{
			System.out.println("The Heap is Empty. ");
			return -1;
			
		}
		return arr[0];
	}
	
	void add(int data)
	{
		arr[size++]=data;
		heapifyUp();
	}
	void heapifyUp()
	{
		int currIndex = size-1;
		while(hasParent(currIndex)&& parent(currIndex)<arr[currIndex]) 
		{
			swap(getParentIndex(currIndex),currIndex);
			currIndex=getParentIndex(currIndex);
		}
	}
	void swap(int index1,int index2)
	{
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	
}

public class HeapImpl {
	
	public static void main(String[]args)
	{
		MyHeap heap=new MyHeap();
		System.out.println(heap.isEmpty());
		System.out.println(heap.peek());
		heap.add(7);
		System.out.println(heap.isEmpty());
		System.out.println(heap.peek());
		heap.add(8);
		System.out.println(heap.peek());
		heap.add(5);
		System.out.println(heap.peek());
	}

}
