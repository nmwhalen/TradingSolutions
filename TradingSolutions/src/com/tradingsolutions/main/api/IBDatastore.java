package com.tradingsolutions.main.api;

import java.util.HashMap;

public class IBDatastore {

	private Integer nextValidId;
	
	private HashMap<Integer, Tick> ticks = new HashMap<Integer, Tick>();
	
	public Integer getNextValidId() {
		return nextValidId;
	}
	
	public void setNextValidId(Integer nextValidId) {
		this.nextValidId = nextValidId;
	}
	
	public Tick getLatestTick(int symbolId) {
		return ticks.get(symbolId);
	}
}
