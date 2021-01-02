package com.waseykhan.list;

public class Main {

	public static void main(String[] args) {
		
		LinkedListStack lls = new LinkedListStack();
		lls.push(4);
		lls.push(5);
		lls.push(6);
		lls.push(7);
		lls.push(8);
		lls.push(9);
		System.out.println("There are " + lls.getStackSize() + " elements in the stack");
		lls.getNodes();
		System.out.println("Value poped " + lls.pop());
		System.out.println("--------------");
		System.out.println("There are " + lls.getStackSize() + " elements in the stack");
		lls.getNodes();
		System.out.println("Value poped " + lls.pop());
		System.out.println("Value poped " + lls.pop());
		System.out.println("Value poped " + lls.pop());
		System.out.println("Value poped " + lls.pop());
		System.out.println("--------------");
		System.out.println("There are " + lls.getStackSize() + " elements in the stack");
		System.out.println("Value poped " + lls.pop());
		System.out.println("There are " + lls.getStackSize() + " elements in the stack");
		System.out.println(lls.pop());
		lls.getNodes();
	}

}
