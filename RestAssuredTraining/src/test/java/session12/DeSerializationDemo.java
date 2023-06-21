package session12;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class DeSerializationDemo {
	//https://reqres.in/api/users
	
	@Test
	public void createUser()
	{
		//create Request Specification
		RequestSpecification requestSpec=RestAssured.given();
		
		//Specify url
		requestSpec.baseUri("https://reqres.in");
		requestSpec.basePath("api/users");
		
		//create request body
		JSONObject jsonData=new JSONObject();
		jsonData.put("name", "sujit");
		jsonData.put("job", "SQA");
		
		//perform post request
		Response response=requestSpec.contentType(ContentType.JSON)
		.body(jsonData.toJSONString())
		.post();
		
		ResponseBody responseBody=response.getBody();
		
		//Deserialize responseBody i.e josn response body to class object
		JSONPostRequestResponse responseclass=responseBody.as(JSONPostRequestResponse.class);
		Assert.assertEquals(responseclass.name, "sujit","checking for name");
		Assert.assertEquals(responseclass.job, "SQA");
		
		
	}

}
