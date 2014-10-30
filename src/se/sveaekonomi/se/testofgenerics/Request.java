package se.sveaekonomi.se.testofgenerics;


public class Request implements Requestable {

	@SuppressWarnings("unchecked")
	public Response doRequest() {
		return new Response();
	}
}
