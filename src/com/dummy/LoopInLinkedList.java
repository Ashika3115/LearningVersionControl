package com.dummy;
import java.util.*;
 
public class LoopInLinkedList {
	
	public static Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
		this.data = data;
		next = null;
		}
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		
		newNode.next = head;
		head = newNode;
	}
	
	public boolean detectLoop(Node h) {
		
		HashSet<Node> hashSet = new HashSet<Node>();
		while(h!=null)
		{
			if(hashSet.contains(h))
			{
				return true;
			}	
			
				hashSet.add(h);
				h = h.next;
			
		}
		return false;
		
	}
	
	public boolean removeLoop(Node h)
	{
		HashSet<Node> hashSet = new HashSet<Node>();
		Node previous = null;
		while(h!=null)
		{
			if(hashSet.contains(h))
			{
				previous.next = null;
				return true;
			}
			else
			{
				hashSet.add(h);
				previous = h;
				h = h.next;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		LoopInLinkedList integers = new LoopInLinkedList();
		integers.push(20);
		integers.push(73);
		integers.push(48);
		integers.push(22);
		integers.push(55);
		integers.push(66);
		
		integers.head.next.next.next.next.next = integers.head;
		
		if(integers.detectLoop(head))
		{
			System.out.println("Loop Detected");
			if(integers.removeLoop(head))
				System.out.println("The loop removed");
			
		}	
		else
			System.out.println("Loop not Detected");
		
		
		
	}
}