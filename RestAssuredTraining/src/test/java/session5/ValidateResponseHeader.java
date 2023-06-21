package session5;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateResponseHeader {
	//https://reqres.in/api/users/2
	@Test
	public void GetSingleUser()
	{
		RequestSpecification requestSpec=RestAssured.given();
		//specify base uri
		requestSpec.baseUri("https://reqres.in/");
		requestSpec.basePath("api/users/2");
		//create get request
		Response response =requestSpec.get();
		//validate response header
		String ContentType=response.getHeader("Content-Type");
		System.out.println("Content Type"+ContentType);
		//Read all the response header attribute/keys and print their values
		Headers headerlist=response.getHeaders();
		//iterate over header list
		for(Header header:headerlist)
		{
			System.out.println("keys:"+header.getName()+"Values:"+header.getValue());
		}
			
		//validate header Content-type ,expected value:
		Assert.assertEquals(ContentType, "application/json; charset=utf-8","Header content mismatched");
		
	}

}
