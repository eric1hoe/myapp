package com.eric.net.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		System.out.println("start server");
		Server server=new Server();
		server.init();
	}
	private static void init(){
		try {
			ServerSocket serverSocket=new ServerSocket(8888);
			while(true){
				Socket client =serverSocket.accept();
				new Thread(new Handler(client)).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static class Handler implements Runnable{
		private Socket client;
		public Handler(Socket client) {
			this.client=client;
		}
		@Override
		public void run() {
			DataInputStream inputStream=null;
			DataOutputStream outputStream=null;
			try {
				inputStream=new DataInputStream(client.getInputStream());
				String reciveMsg=inputStream.readUTF();
				System.out.println("客户端："+reciveMsg);
				outputStream=new DataOutputStream(client.getOutputStream());
				System.out.print("请输入:\t");    
                // 发送键盘输入的一行    
                String s = new BufferedReader(new InputStreamReader(System.in)).readLine(); 
				outputStream.writeUTF(s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(null!=inputStream)
						inputStream.close();
					if(null!=outputStream)
						outputStream.close();
					if(null!=client)
						client.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}


}
