package com.tradingsolutions.main.api;

import java.util.List;

import com.ib.client.ComboLeg;
import com.ib.client.Contract;
import com.ib.client.EClientSocket;
import com.ib.client.EReaderSignal;
import com.ib.client.EWrapper;

public class IBHandler {
	
	private EClientSocket clientSocket;
	private IBDatastore ibDatastore;
	
	public IBHandler(EClientSocket clientSocket, IBDatastore ibDatastore) {
		this.clientSocket = clientSocket;
		this.ibDatastore = ibDatastore;
	}
	
	public void subscribeQuoteData(int tickerId, String symbol, String exchange) {
		Contract contract = createContract(symbol, exchange);
		
		clientSocket.reqMktData(tickerId, contract, "236,258", false, false, null);
	}
	
	protected Contract createContract(String symbol, String exchange) {
		Contract contract = new Contract(0, symbol, "STK", null, 0.0d, null, null, exchange, "USD", 
				null, null, null, "SMART", false, null, null, null, null);
		return contract;
	}
	
	public void connect() {
		clientSocket.eConnect(IBConfig.getIpaddress(), IBConfig.getPort(), IBConfig.getClientid());
	}
	
	public void disconnect() {
		clientSocket.eDisconnect();
	}	
}