package com.eric.net.socket;

import java.io.IOException;
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
				Socket socket =serverSocket.accept();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
