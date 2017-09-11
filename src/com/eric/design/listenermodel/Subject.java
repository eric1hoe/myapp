package com.eric.design.listenermodel;
/**
 * 
 * @author quhao
 * 主题接口
 */
public interface Subject {
	void addListener(Listener listener);
	void removeListener(Listener listener);
	void notifyListener();
}
