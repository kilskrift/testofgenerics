package se.sveaekonomi.se.testofgenerics;

import se.sveaekonomi.se.testofgenerics.request.AnotherRequest;
import se.sveaekonomi.se.testofgenerics.request.Request;
import se.sveaekonomi.se.testofgenerics.request.Requestable;
import se.sveaekonomi.se.testofgenerics.request.VariantRequest;

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
	@SuppressWarnings("unchecked")
	public <T extends Requestable> T getRequest() {
		if( this.requestFlag ) {
			return (T) new Request();
		}
		else {
			return (T) new VariantRequest();
		}		
	}

}
