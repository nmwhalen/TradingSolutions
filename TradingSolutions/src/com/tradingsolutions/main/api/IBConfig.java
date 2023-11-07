package com.tradingsolutions.main.api;

public class IBConfig {

	private final int clientId;
	private final int port;
	private final String ibAccount;
	private final String ipAddress;
	
	public IBConfig() {
		
		// Important configuration values
		clientId = 1;
		port = 7497;
		ibAccount = "DU8079603";
		ipAddress = "127.0.0.1";
		
	}

	public int getClientId() {
		return clientId;
	}

	public int getPort() {
		return port;
	}
	
	public String getIBAccount() {
		return ibAccount;
	}
	
	public String getIPAddress() {
		return ipAddress;
	}
}
