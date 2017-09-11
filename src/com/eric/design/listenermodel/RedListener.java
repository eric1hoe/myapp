package com.eric.design.listenermodel;

public class RedListener implements Listener {

	@Override
	public void updateSignal(String whichLight, int time) {
		if("red".equals(whichLight)){
			System.out.println("红灯亮了");
			System.out.println("持续时间："+time);
		}
	}
}
