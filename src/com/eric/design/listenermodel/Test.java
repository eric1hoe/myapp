package com.eric.design.listenermodel;

public class Test {

	public static void main(String[] args) {
		Listener listener=new RedListener();
		Light sub=new Light();
		sub.addListener(listener);
		sub.setLight("red", 20);
	}

}
