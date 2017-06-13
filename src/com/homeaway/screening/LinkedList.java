package com.homeaway.screening;

public class LinkedList
{

	static class Node
	{
		int value;
		Node next;

		public Node() {
		}

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public boolean isEmpty() {
			return this == null;
		}
	}
	
	
	//We need to do a single pass to find the middle node in linked list.
	// runtime complexity is O(n/2) ~ O(n), 
	public static Node midNode(Node head) 
	{

	  Node faster = head;
	  Node current = head;
	  
	  while (faster != null && faster.next != null)
	  {
		faster = faster.next.next;
		current = current.next;
	  }
	  
	  return current;
    }
	
	
	   public static Node makeLinkedListFromArray(int[] input, int n)
	   { 
		   if (n == 0) 
		   {
			 return null;
		   }
		   else if (n == 1) 
		   {
			  Node node = new Node(input[0],null);
			  return node;
		   }
		   else
		   {
			Node prevNode = makeLinkedListFromArray(input, n-1);
			Node node = new Node(input[n-1], prevNode);
			return node; 
		   }
	   }
	   
	    public static void main(String[] args)
	    {
	    	int[] input = {8,2,1,0,9};	    	
	    	Node head = makeLinkedListFromArray(input, input.length); 	    	
	    	Node midNode = midNode(head);
	    	System.out.println(midNode.value);
	    }
}
