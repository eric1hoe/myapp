package com.eric.net.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		System.out.println("start client");
		Client client=new Client();
		while(true){
			client.init();		
		}
	}
	private static void init(){
		DataOutputStream outputStream=null;
		DataInputStream inputStream=null;
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1", 8888);
			outputStream=new DataOutputStream(socket.getOutputStream());
			System.out.print("请输入:\t");    
            // 发送键盘输入的一行    
            String s = new BufferedReader(new InputStreamReader(System.in)).readLine(); 
			outputStream.writeUTF(s);
			inputStream=new DataInputStream(socket.getInputStream());
			String reciveMsg=inputStream.readUTF();
			System.out.println("服务端："+reciveMsg);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(null!=inputStream)
					inputStream.close();
				if(null!=outputStream)
					outputStream.close();
				if(null!=socket)
					socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
