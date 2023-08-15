package priorityQueueAndHeaps;
import java.util.*;

public class InbuiltClassStudy {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
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
