package session9;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthorizationDemo {
	@Test
	public void BearerToken()
	{
		//create request specification 
		RequestSpecification requestSpec=RestAssured.given();
		requestSpec.baseUri("https://gorest.co.in");
		requestSpec.basePath("/public/v2/users");
		JSONObject payload=new JSONObject();
		payload.put("name", "sujit");
		payload.put("gender", "maile");
		payload.put("email", "sujit2@getnada.com");
		payload.put("status", "Active");
		String AuthToken="d5d779128023f02e0ce72dc8ba259d7cbf43aa0248590ac7bd62618873e2b6dd";
		requestSpec.header("Authorization",AuthToken).contentType(ContentType.JSON).body(payload.toString() );
		Response response=requestSpec.post();
		Assert.assertEquals(response.statusCode(), 201);
		System.out.println("Status Code :"+response.statusCode());
		System.out.println("Response Body: "+response.body());
		
	}

}
