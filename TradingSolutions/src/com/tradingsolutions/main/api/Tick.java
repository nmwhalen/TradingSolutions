package com.tradingsolutions.main.api;

public class Tick {

	private double bid;
	private double ask;
	private int bidSize;
	private int askSize;
	private double last;
	private long modifiedAt;
	private int lastTradeVolume;
	private boolean shortable;
	
	public double getBid() {
		return bid;
	}
	
	public double getAsk() {
		return ask;
	}
	
	public int getBidSize() {
		return bidSize;
	}

	public int getAskSize() {
		return askSize;
	}
	
	public double getLast() {
		return last;
	}
	
	public long getModifiedAt() {
		return modifiedAt;
	}
	
	public int getLastTradeVolume() {
		return lastTradeVolume;
	}
	
	public boolean getShortable() {
		return shortable;
	}

	public void setBid(double bid) {
		this.bid = bid;
	}
	
	public void setAsk(double ask) {
		this.ask = ask;
	}
	
	public void setBidSize(int bidSize) {
		this.bidSize = bidSize;
	}
	
	public void setAskSize(int askSize) {
		this.askSize = askSize;
	}
	
	public void setLast(double last) {
		this.last = last;
	}
	
	public void setModifiedAt(long modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	
	public void setLastTradeVolume(int lastTradeVolume) {
		this.lastTradeVolume = lastTradeVolume;
	}
	
	public void setShortable(boolean shortable) {
		this.shortable = shortable;
	}
	
}
