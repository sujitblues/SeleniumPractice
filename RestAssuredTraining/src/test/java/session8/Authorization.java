package session8;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authorization {
	@Test
	public void BasicAuth()
	{
		RequestSpecification requestSpec=RestAssured.given();
		//specify url
		requestSpec.baseUri("https://postman-echo.com/");
		
		requestSpec.basePath("/basic-auth");
		//perform get request
		//Response response=requestSpec.auth().basic("postman","password").get();//non preemptive
		Response response=requestSpec.auth().preemptive().basic("postman","password").get();
		//print status line
		System.out.println("Response status:"+response.statusLine());
		System.out.println("Response Body :"+response.body().asString());
	}
	@Test
	public void DigestAuth()
	{
		RequestSpecification requestSpec=RestAssured.given();
		//specify url
		requestSpec.baseUri("http://httpbin.org");
		
		requestSpec.basePath("/digest-auth/undefined/sujit/sujit");
		//perform get request
		
		Response response=requestSpec.auth().digest("sujit","sujit").get();
		Assert.assertEquals(response.statusCode()/*atual*/, 200,"Check for status code");
		//print status line
		System.out.println("Response status:"+response.statusLine());
		System.out.println("Response Body :"+response.body().asString());
	}

}
