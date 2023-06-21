package day1;

import  org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

/* 
 Given()
 Content type,set cookies ,add auth,add param,set headers info etc
 When()
 get,post,put,delete
 Then()
 validate status code,extract response extract header cookies and response body
 */
public class HTTPRequests {
	int id;
	
	@Test(priority=1)
	void getUser()
	{
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().ifError();
		
		
	}
	@Test(priority=2)
	void createUser()
	{
		HashMap data=new HashMap();
		data.put("name", "Sujit");
		data.put("job", "Testing");
		
		id=given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
		//.then()
			//.statusCode(201)
			//.log().all();
		
	}
	@Test(priority=3,dependsOnMethods= {"createUser"})
	void updateuser()
	{
		HashMap data=new HashMap();
		data.put("name", "Roshan");
		data.put("job", "Automation");
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.put("https://reqres.in/api/users/"+id)
			.then()
			.statusCode(200)
			.log().all();
	}
	@Test(priority=4)
	void deleteuser()
	{
		given()
		.when()
		.delete("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(204)
		.log().all();
		
		
	}
	@Test
	public void singleUser()
	{
		RestAssured.baseURI="https://reqres.in/";
		given()
			.pathParam("id", 2)
		.when()
			.get("api/users/{id}")
			
		.then().log().all();
	}
	
	}
	


