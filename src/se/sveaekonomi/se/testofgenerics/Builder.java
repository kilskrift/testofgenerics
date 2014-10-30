package se.sveaekonomi.se.testofgenerics;

public class Builder {

	private boolean flag;

	public Builder() {
		this.flag = false;
	}
	
	public void setFlag(boolean b) {
		this.flag = b;
	}

	public Request getRequest() {
		return new Request();
	}
	
	public AnotherRequest getAnotherRequest() {
		return new AnotherRequest();
	}

}
