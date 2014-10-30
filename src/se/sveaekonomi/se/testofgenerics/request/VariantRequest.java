package se.sveaekonomi.se.testofgenerics.request;

import se.sveaekonomi.se.testofgenerics.response.VariantResponse;


public class VariantRequest implements Requestable {
	
	@SuppressWarnings("unchecked")
	public VariantResponse doRequest() {
		return new VariantResponse();
	}

}
