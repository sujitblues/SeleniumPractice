package session11;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Auth2 {
	static String AccessToken="";
	@Test
	public void getAccessToken()
	{
		String clientId="AX_tLWfeEFeaYeg5B7zMY6lswRi9lYUr2M5udXn97zNya-FeYJog8xw1Y2QTCSSRRn704jLnxWjglJGf";
		String clientSecret="EEM3Lc6lXRMVoK82oZY6xZ-14GmziyLKgHYRr3IAwQGxAAjyDjEqU7CYLVKhlQ8NBVXA3pvEF15EEXJn";
		
		//https://api-m.sandbox.paypal.com/v1/oauth2/token
		//Create request Specification
		RequestSpecification requestSpec=RestAssured.given();
		//URL
		requestSpec.baseUri("https://api-m.sandbox.paypal.com");
		requestSpec.basePath("/v1/oauth2/token");
		Response response=requestSpec.auth().preemptive().basic(clientId, clientSecret).queryParam("grant_type", "client_credentials").post();
		response.prettyPrint();
		System.out.println("Staus Code:"+response.statusCode());
		System.out.println("Status line:"+response.statusLine());
		Assert.assertEquals(response.statusCode(), 200,"checking status code");
		AccessToken=response.getBody().path("access_token");
		System.out.println("AccessToken :"+AccessToken);
		
	}
	@Test(dependsOnMethods="getAccessToken")
	public void getInvoice()
	{
		Response res=RestAssured.given().auth().oauth2(AccessToken).queryParam("page", 3)
		.queryParam("page_size", 4)
		.queryParam("total_count_required", true)
		.get("https://api-m.sandbox.paypal.com/v1/invoicing/invoices");
		res.prettyPrint();
		System.out.println("Status Code:"+res.statusCode());
		System.out.println("Status line:"+res.statusLine());
		Assert.assertEquals(res.statusCode(), 200,"Checking status code");
		
	}

}
