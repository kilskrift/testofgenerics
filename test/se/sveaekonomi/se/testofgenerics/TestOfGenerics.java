package se.sveaekonomi.se.testofgenerics;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

public class TestOfGenerics {

	@Test
	public void testResponseType() {
		Builder builder = new Builder();
		Request request = builder.getRequest();		
		Response response = request.doRequest();
		
		assertThat( response, instanceOf(Response.class) );
	}
}
