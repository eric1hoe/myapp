package com.eric.design.listenermodel;

import java.util.ArrayList;
import java.util.List;

public class Light implements Subject {
	private List<Listener> listeners;
	private String whichLight;
	private int time;
	public Light() {
		listeners=new ArrayList<>();
	}
	@Override
	public void addListener(Listener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}

	@Override
	public void notifyListener() {
		for(Listener listener:listeners){
			listener.updateSignal(whichLight, time);
		}
	}
	public void setLight(String whichLight,int time ){
		this.whichLight=whichLight;
		this.time=time;
		notifyListener();
	}

}
