package com.eric.datastructure;

public class BothLink<E> {
	private Node<E> head;
	private Node<E> foot;
	private int size=0;
	static class Node<E>{
		Node<E> pre;
		E date;
		Node<E> next;
		public Node(E e) {
			date=e;
		}
		public Node(Node<E> pre, E date, Node<E> next) {
			super();
			this.pre = pre;
			this.date = date;
			this.next = next;
		}
		boolean hasNext(){
			return next!=null;
		}
	}
	void addFoot(E e){
		Node<E> f=foot;
		Node<E> newNode=new Node<E>(f, e, null);
		foot=newNode;	
		if(f==null)
			head=newNode;
		else
			f.next=newNode;
		size++;
	}
	void addHead(E e){
		Node<E> h=head;
		Node<E> newNode=new Node<E>(null,e,h);
		head=newNode;
		if(h==null)
			foot=newNode;
		else
			h.pre=newNode;
		size++;
	}
	void remove(int index){
		checkIndex(index);
		if((index+1)<=size>>1){
			Node<E> node=head;
			/*for(node=node.next;){
				ll
			}*/
		}else{
			
		}
	}
	void checkIndex(int index){
		if(index>=size||index<0)
			throw new IndexOutOfBoundsException("size:"+size+",index:"+index);
	}
	
}
