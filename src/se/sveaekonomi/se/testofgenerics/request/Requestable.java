package se.sveaekonomi.se.testofgenerics.request;

import se.sveaekonomi.se.testofgenerics.response.Respondable;

public interface Requestable {

	public <T extends Respondable> T doRequest();
}
