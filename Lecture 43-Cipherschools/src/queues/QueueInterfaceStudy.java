package queues;

import java.util.*;

public class QueueInterfaceStudy {
	
	public static void main(String[]args)
	{
		Queue<Integer> q= new LinkedList<>();
		System.out.println(q.isEmpty());
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.isEmpty());
		System.out.println(q.poll());
		System.out.println(q.peek());
	}
}
