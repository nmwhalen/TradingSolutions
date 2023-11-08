package com.tradingsolutions.main.api;

public class IBConfig {

	private final static int clientId = 1;
	private final static int port = 7497;
	private final static String ibAccount = "DU8079603";
	private final static String ipAddress = "127.0.0.1";
	
	public static int getClientid() {
		return clientId;
	}

	public static int getPort() {
		return port;
	}

	public static String getIbaccount() {
		return ibAccount;
	}

	public static String getIpaddress() {
		return ipAddress;
	}
}
