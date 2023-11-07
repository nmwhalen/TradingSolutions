package com.tradingsolutions.main.api;

import com.ib.client.EClientSocket;
import com.ib.client.EReaderSignal;
import com.ib.client.EWrapper;

public class IBHandler extends EClientSocket {
	
	EClientSocket m_client;
	
	public IBHandler(EWrapper wrapper, EReaderSignal eReaderSignal, EClientSocket m_client) {
		super(wrapper, eReaderSignal);
		this.m_client = m_client;
	}
	
	public void connect() {
		m_client.eConnect("127.0.0.1", 7497, 1);
	}
	
	public void disconnect() {
		m_client.eDisconnect();
	}
}