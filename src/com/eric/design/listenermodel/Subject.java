package com.eric.design.listenermodel;
/**
 * 
 * @author quhao
 * ����ӿ�
 */
public interface Subject {
	void addListener(Listener listener);
	void removeListener(Listener listener);
	void notifyListener();
}
