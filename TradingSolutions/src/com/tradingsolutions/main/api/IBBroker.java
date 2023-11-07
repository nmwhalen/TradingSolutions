package com.tradingsolutions.main.api;

import com.ib.client.EClientSocket;

public class IBBroker {
	private EClientSocket clientSocket;
	
	public IBBroker(EClientSocket clientSocket) {
		this.clientSocket = clientSocket;
	}

	public void connect() {
		clientSocket.eConnect("127.0.0.1", 7497, 1);
	}
	
	public void disconnect() {
		clientSocket.eDisconnect();
	}
}