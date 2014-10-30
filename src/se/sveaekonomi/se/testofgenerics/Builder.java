package se.sveaekonomi.se.testofgenerics;

public class Builder {

	private boolean requestFlag;

	public Builder() {
		this.requestFlag = true;	// i.e. orderrows present in deliverOrderBuilder
	}
	
	public Builder setRequestFlag(boolean b) {
		this.requestFlag = b;
		return this;
	}

	public AnotherRequest getAnotherRequest() {
		return new AnotherRequest();
	}

	// refer to http://stackoverflow.com/questions/450807/how-do-i-make-the-method-return-type-generic
	public <T extends Requestable> T getRequest() {
		if( this.requestFlag ) {
			return (T) new Request();
		}
		else {
			return (T) new VariantRequest();
		}		
	}

}
