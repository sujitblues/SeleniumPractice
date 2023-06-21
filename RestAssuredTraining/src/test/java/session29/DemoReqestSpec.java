package session29;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class DemoReqestSpec {
	RequestSpecification request=new RequestSpecBuilder().setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
	@Test(priority=1)
	public void createUser()
	{
		HashMap<String,Object> payload=new HashMap<String,Object>();
		payload.put("name", "Rakesh");
		payload.put("job", "java Dev");
		
		//RequestSpecification request=new RequestSpecBuilder().setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
		ResponseSpecification resSpec=new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
		
		RequestSpecification res=given().spec(request)
		.body(payload);
		
		Response response=res.when().post("/api/users")
		.then().spec(resSpec).extract().response();
		String responseString=response.asString();
		System.out.println(responseString);
		
	}
	@Test(priority=2)
	public void createUserUsingPOJO()
	{
		userPOJO payload=new userPOJO();
		payload.setName("Sujit");
		payload.setJob("Dev");
		
		//RequestSpecification request=new RequestSpecBuilder().setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
		ResponseSpecification resSpec=new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
		
		RequestSpecification res=given().spec(request)
		.body(payload);
		
		Response response=res.when().post("/api/users")
		.then().spec(resSpec).extract().response();
		String responseString=response.asString();
		System.out.println(responseString);
		
	}
}
