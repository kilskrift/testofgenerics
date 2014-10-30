package se.sveaekonomi.se.testofgenerics;


public class VariantRequest implements Requestable {
	
	@SuppressWarnings("unchecked")
	public VariantResponse doRequest() {
		return new VariantResponse();
	}

}
