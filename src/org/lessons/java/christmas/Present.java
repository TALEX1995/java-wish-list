package org.lessons.java.christmas;

public class Present {
	private String name;
	private String recipient;
	
	public Present(String name, String recipient) {
		setName(name);
		setRecipient(recipient);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	@Override
	public String toString() {
		
		return name + " è il regalo per " + recipient;
	}
}
