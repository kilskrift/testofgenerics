package se.sveaekonomi.se.testofgenerics;

public class Builder {

	private boolean requestFlag;

	public Builder() {
		this.requestFlag = true;	// i.e. orderrows present in deliverOrderBuilder
	}
	
	public void setRequestFlag(boolean b) {
		this.requestFlag = b;
	}

	public Request getRequest() {
		return new Request();
	}

	public AnotherRequest getAnotherRequest() {
		return new AnotherRequest();
	}
}
