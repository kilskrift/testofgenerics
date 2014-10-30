package se.sveaekonomi.se.testofgenerics;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

public class TestOfGenerics {

	// i.e. WebPay.deliverOrder().deliverInvoiceOrder().doRequest() => DeliverOrderResult (WebService/DeliverOrderEU)
	@Test
	public void testResponseType() {
		Builder builder = new Builder();
		Request request = builder.getRequest();		
		Response response = request.doRequest();
		
		assertThat( response, instanceOf(Response.class) );
	}
	
	@Test
	public void testResponseAsObjectType() {
		Object object = new Object();
		object = new Builder().getRequest().doRequest();

		assertThat( object, instanceOf(Response.class) );		
	}		

	
	// i.e. WebPay.deliverOrder().deliverCardOrder().doRequest() => ConfirmTransactionResponse (Hosted/confirm)
	@Test
	public void testAnotherResponseType() {
		Builder builder = new Builder();
		AnotherRequest request = builder.getAnotherRequest();		
		AnotherResponse response = request.doRequest();
		
		assertThat( response, instanceOf(AnotherResponse.class) );
	}	

	@Test
	public void testAnotherResponseAsObjectType() {
		Object object = new Object();
		object = new Builder().getAnotherRequest().doRequest();

		assertThat( object, instanceOf(AnotherResponse.class) );		
	}		
	
	
}
