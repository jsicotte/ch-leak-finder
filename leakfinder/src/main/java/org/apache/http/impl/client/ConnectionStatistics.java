package org.apache.http.impl.client;

public class ConnectionStatistics {
	private String lastRequest;
	private long lastUsed;
	public enum State {OPEN,CLOSED}
	private State connectionState;
	
	public String getLastRequest() {
		return lastRequest;
	}
	public void setLastRequest(String lastRequest) {
		this.lastRequest = lastRequest;
	}
	public long getLastUsed() {
		return lastUsed;
	}
	public void setLastUsed(long lastUsed) {
		this.lastUsed = lastUsed;
	}
	public State getConnectionState() {
		return connectionState;
	}
	public void setConnectionState(State connectionState) {
		this.connectionState = connectionState;
	}
}
