package se.sveaekonomi.se.testofgenerics;


public class Request implements Requestable {

	public Response doRequest() {
		return new Response();
	}

}
