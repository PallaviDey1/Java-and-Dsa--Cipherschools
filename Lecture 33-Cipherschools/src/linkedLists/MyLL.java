package linkedLists;

class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class MyLL {
	static void print(Node head)
	{
		if(head==null)
			{
			System.out.println("empty LL .Nothing to print");
			return;
			}
		while(head != null)
		{
			System.out.println(head.data + " ");
			head= head.next;
		}
		System.out.println();
	}
	static  Node insertAtHead(Node head, int data )
	{
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
		return head;
	}
	
	static  Node insertAtEnd(Node head, int data )
	{
		if(head==null)return new Node(data);
		Node temp = new Node(data);
		
		Node last=head;
		while(last.next !=null)
		{
			last=last.next;
		}
		last.next=temp;
		
		return head;
	}
	
	static Node deleteLL(Node head)
	{
		
		return null;
	}
	static Node deleteFromHead(Node head)
	{
		if(head==null)
		{
			
		
		System.out.println("Empty LL , Nothing to delete");
	    return null;
		}
		return head.next;
	}
	static Node findMiddleElement(Node head)
	{
		Node slow=head;
		Node fast=head;
	
			
		
		while( fast!=null &&  fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println(slow.data);
		return fast;
		
	}
	public static void main(String[]args) {
	Node head = new Node(5);
	 
	Node second = new Node(6);
	head.next= second;
	Node third = new Node(7);
	second.next=third;
	Node fourth = new Node(8);
	third.next= fourth;
    Node fifth = new Node(9);
	fourth.next= fifth;
	//System.out.println(head.data);
	//System.out.println(head.next.data);
	//System.out.println(head.next.next.data);
	//System.out.println(head.next.next.next.data);
	//System.out.println(head.next.next.next.next.data);
	
	Node temp = head;
	while(temp != null)
	{
		System.out.println(temp.data);
		temp=temp.next;
		
	}
	System.out.println(temp);
	print(head);
	print(head);
	
	head = insertAtHead(head,4);
	print(head);
	head = insertAtEnd(head,10);
	print(head);
	
	Node head2 = insertAtEnd(null,1);
			print(head2);
			head2=deleteLL(head2);
			print(head2);
			
			head2=deleteFromHead(head2);
			print(head2);
			head2=deleteFromHead(head2);
			findMiddleElement(head);
			head=insertAtEnd(head,11);
			print(head);
			findMiddleElement(head);
	
	}
}