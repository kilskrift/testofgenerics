package se.sveaekonomi.se.testofgenerics.request;

import se.sveaekonomi.se.testofgenerics.response.Response;


public class Request implements Requestable {

	@SuppressWarnings("unchecked")
	public Response doRequest() {
		return new Response();
	}
}
