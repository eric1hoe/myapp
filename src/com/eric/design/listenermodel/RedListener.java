package com.eric.design.listenermodel;

public class RedListener implements Listener {

	@Override
	public void updateSignal(String whichLight, int time) {
		if("red".equals(whichLight)){
			System.out.println("�������");
			System.out.println("����ʱ�䣺"+time);
		}
	}
}
