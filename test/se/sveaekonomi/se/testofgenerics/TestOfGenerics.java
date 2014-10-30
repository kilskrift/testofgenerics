package se.sveaekonomi.se.testofgenerics;

import org.junit.Test;

import se.sveaekonomi.se.testofgenerics.request.AnotherRequest;
import se.sveaekonomi.se.testofgenerics.request.Request;
import se.sveaekonomi.se.testofgenerics.request.Requestable;
import se.sveaekonomi.se.testofgenerics.request.VariantRequest;
import se.sveaekonomi.se.testofgenerics.response.AnotherResponse;
import se.sveaekonomi.se.testofgenerics.response.Respondable;
import se.sveaekonomi.se.testofgenerics.response.Response;
import se.sveaekonomi.se.testofgenerics.response.VariantResponse;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

public class TestOfGenerics {

	// i.e. WebPay.deliverOrder().deliverInvoiceOrder() with orderrows => Request
	@Test
	public void testGetRequestReturnsRequest() {
		Builder builder = new Builder();
		Request request = builder.getRequest();		
		
		assertThat( request, instanceOf(Request.class) );		
	}

	// i.e. WebPay.deliverOrder().deliverInvoiceOrder() without orderrows => VariantRequest
	@Test
	public void testGetRequestWithoutFlagReturnsVariantRequest() {
		Builder builder = new Builder();
		builder.setRequestFlag(false); 
		Requestable request = builder.getRequest();		
		
		assertThat( request, instanceOf(VariantRequest.class) );		
	}	
	
	// i.e. WebPay.deliverOrder().deliverInvoiceOrder().doRequest() => DeliverOrderResult (WebService/DeliverOrderEU)
	@Test
	public void testResponseType() {
		Builder builder = new Builder();
		Request request = builder.getRequest();		
		Response response = request.doRequest();
		
		assertThat( response, instanceOf(Response.class) );
	}

	@Test
	public void testFluentResponseType() {
		Respondable response = new Builder().getRequest().doRequest();
		
		assertThat( response, instanceOf(Response.class) );
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
		
	// i.e. WebPay.deliverOrder().deliverInvoiceOrder().doRequest() without orderrows => DeliverOrdersResponse (AdminService/DeliverOrders) 
	@Test
	public void testVariantResponseType() {
		Builder builder = new Builder();
		builder.setRequestFlag(false); 
		Requestable request = builder.getRequest();		
		Respondable response = request.doRequest();
		
		assertThat( response, instanceOf(VariantResponse.class) );		
	}	
	
	@Test
	public void testFluentResponseTypeWithoutFlagReturnsVariantRequest() {
		Respondable response = new Builder().setRequestFlag(false).getRequest().doRequest();
		
		assertThat( response, instanceOf(VariantResponse.class) );
	}		
		
}
