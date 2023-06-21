package responseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CheckForValidResponse {
	@Test(enabled=false)
	public void getSingleuser()
	{
		baseURI="https://reqres.in/api/users/23";
		//get Request spefification of the request
		RequestSpecification requestSpec=given();
		//call get method
		Response response=requestSpec.get();
		//get response code
		int statusCode=response.getStatusCode();
		//validate actualstatuscode with expected
		//Assert.assertEquals(statusCode, 200);
		String statusLine=response.getStatusLine();
		Assert.assertEquals(statusCode, 201);
		Assert.assertEquals(response.time(),"45","validation response time");
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK","Incorrect status line returned");
		
	}
	@Test(enabled=false)
	public void getSingleuserUsingValidatableResponse()
	{
		baseURI="https://reqres.in/api/users/2";
		//get Request spefification of the request
		RequestSpecification requestSpec=given();
		//call get method
		Response response=requestSpec.get();
		ValidatableResponse validateRes=response.then();
		//Status code
		validateRes.statusCode(200);
		//status line
		validateRes.statusLine("HTTP/1.1 200 OK");
		
	}
	@Test(enabled=true)
	public void getSingleuser_BDDStyle()
	{
		given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK");
		
	}

}
