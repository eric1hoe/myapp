package com.eric.datastructure;

public class LinkedList<E> {
	private Node<E> head=new Node<>();
	static class Node<E>{
		E date;
		Node<E> next;
		
		public Node() {
		}
		public Node(E e) {
			date=e;
		}
		boolean hasNext(){
			return next!=null;
		}
	}
	void add(E e){
		Node<E> node=new Node<>(e);
		if(!head.hasNext()){
			head.next=node;
		}else{
			node.next=head.next;
			head.next=node;	
		}
	}
	public Node<E> getHead(){
		return head;
	}
	
}
