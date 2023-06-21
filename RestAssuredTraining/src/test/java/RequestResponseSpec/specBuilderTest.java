package RequestResponseSpec;

import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class specBuilderTest {
	int id;
	RequestSpecification request=new RequestSpecBuilder().setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
	ResponseSpecification resSpec=new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
	@Test(priority=1)
	public void createUser()
	{
		HashMap<String,Object> payload=new HashMap<String,Object>();
		payload.put("name", "Rakesh");
		payload.put("job", "java Dev");
		
		//RequestSpecification request=new RequestSpecBuilder().setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
		//ResponseSpecification resSpec=new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
		
		RequestSpecification res=given().spec(request)
		.body(payload);
		
		Response response=res.when().post("/api/users")
		.then().spec(resSpec).extract().response();
		String responseString=response.asString();
		System.out.println(responseString);
		
	}
	@Test(priority=2,dependsOnMethods= {"createUser"})
	void updateuser()
	{
		HashMap<String,Object> payload=new HashMap<String,Object>();
		payload.put("name", "Roshan");
		payload.put("job", "Automation");
		

		RequestSpecification res=given().spec(request)
		.body(payload);
		Response response=res.when().put("/api/users/"+id)
				.then().spec(resSpec).extract().response();
				String responseString=response.asString();
				System.out.println(responseString);
	
					
	}
	@Test(priority=3)
	void deleteuser()
	{
		RequestSpecification res=given().spec(request);
		Response response=res.when().delete("/api/users/"+id)
				.then().spec(resSpec).extract().response();
				String responseString=response.asString();
				System.out.println(responseString);
		
	}

}
