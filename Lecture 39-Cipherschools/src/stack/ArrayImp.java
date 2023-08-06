package stack;

class MyStack{
	final int size=10;
	int arr[]=new int[size];
	int top=-1;
	
	int peek()
	{
		if(this.isEmpty())
		{
			System.out.println("Empty stack ! Nothing on top");
			return -1;
		}
		return arr[top];
	}
	boolean isEmpty()
	{
		return top == -1;
	}
	void push(int data)
	{
		if(top>=size-1)
		{
			System.out.println("Stack Overflow unable to push");
			return;
		}
		//top = top+1;
		//arr[top]=data;
		arr[++top]=data;
	}
	int pop()
	{
		if(this.isEmpty())
		{
			System.out.println("Empty stack ! Nothing to pop");
			return -1;
		}
		//int temp = arr[top];
		//top--;
		//return temp;
		return arr[top--];
	}
}

public class ArrayImp {
	public static void main(String[]args) {
		MyStack stack  = new MyStack();
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}

}
