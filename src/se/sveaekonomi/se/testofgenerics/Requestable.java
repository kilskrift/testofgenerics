package se.sveaekonomi.se.testofgenerics;

public interface Requestable {

	public <T extends Respondable> T doRequest();
}
