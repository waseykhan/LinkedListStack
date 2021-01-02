package com.waseykhan.list;

public class LinkedListStack {
	
	Node<Integer> head;
	public int size;
	
	public LinkedListStack() {
		this.size = 0;
		Node<Integer> newNode = new Node<Integer>();
		if(head == null) {
			newNode.data = null;    //padding
			newNode.next = null;
			head = newNode;
		}
	}
	

	/*
	 * push the items onto the stack
	 * */
	public void push(int input) {
		Node<Integer> node = new Node<Integer>();     	// create a new node  
		node.data = input;        		//add input value to the node data 	
		node.next = head;				//point the node ptr to the head nodes address or the nodes address
		head = node;					//point the head node to the newly created node 		
		size++;							//increment the size of the stack
	}
	
	public String pop() {
		if(head.next == null) {					//if we are pointing to the padded element stack is empty
			return "No items in the stack!";	
		}
		String result = getNode(head);   //return the value at the top of the stack 
		head = head.next;					//point the head to the next available node
		size--;
		return result;
	}
	
	
	public void getNodes() {
		Node<Integer> temp = head;
		System.out.println(getNode(temp));
		try {
			while(temp.next.next != null) {
				temp = temp.next;
				System.out.println(getNode(temp));
			}
		}catch(NullPointerException e) {
			System.out.println("Empty stack!");
		}
	}
	
	public String getNode(Node<Integer> n) {
		return n.data + "";
	}
	
	public int getStackSize() {
		return this.size;
	}
	
	
}
