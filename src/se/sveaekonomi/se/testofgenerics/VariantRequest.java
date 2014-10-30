package se.sveaekonomi.se.testofgenerics;


public class VariantRequest implements Requestable {
	
	public VariantResponse doRequest() {
		return new VariantResponse();
	}

}
