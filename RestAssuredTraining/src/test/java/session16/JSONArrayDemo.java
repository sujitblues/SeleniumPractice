package session16;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JSONArrayDemo {
	
	@Test
	public void createUserUsingJSONArray()
	{
		JSONObject user1=new JSONObject();
		user1.put("firstName", "sujit");
		user1.put("lastName", "Kumar");
		user1.put("age", 40);
		user1.put("Salary", 10000);
		
		JSONObject user2=new JSONObject();
		user2.put("firstName", "sujit");
		user2.put("lastName", "Kumar");
		user2.put("age", 40);
		user2.put("Salary", 10000);
		
		JSONObject user3=new JSONObject();
		user3.put("firstName", "sujit");
		user3.put("lastName", "Kumar");
		user3.put("age", 40);
		user3.put("Salary", 10000);
		
		//add json object to json array
		JSONArray usersPayload=new JSONArray();
		usersPayload.add(user1);
		usersPayload.add(user2);
		usersPayload.add(user3);
		
		//Create request specification
		RequestSpecification requestspec=RestAssured.given();
		
		//specify url
		requestspec.baseUri("https://reqres.in/api/users");
		requestspec.contentType(ContentType.JSON);
		requestspec.body(usersPayload);
		Response response=requestspec.post();
		response.prettyPrint();
		
		//validate the status code
		Assert.assertEquals(response.statusCode(), 201,"Checking status code");
		
		
	}
	@Test
	public void createJSONArrayUsingList()
	{
		
		Map<String,Object> user1=new HashMap<String,Object>();
		user1.put("firstName", "sujit");
		user1.put("lastName", "Kumar");
		user1.put("age", 40);
		user1.put("Salary", 10000);
		Map<String,Object> user2=new HashMap<String,Object>();
		user2.put("firstName", "sujit");
		user2.put("lastName", "Kumar");
		user2.put("age", 40);
		user2.put("Salary", 10000);
		Map<String,Object> user3=new HashMap<String,Object>();
		user3.put("firstName", "sujit");
		user3.put("lastName", "Kumar");
		user3.put("age", 40);
		user3.put("Salary", 10000);
		
	List<Map<String,Object>>usersPayload=new ArrayList();
		usersPayload.add(user1);
		usersPayload.add(user2);
		usersPayload.add(user3);
		
		//Create request specification
		RequestSpecification requestspec=RestAssured.given();
		
		//specify url
		requestspec.baseUri("https://reqres.in/api/users");
		requestspec.contentType(ContentType.JSON);
		requestspec.body(usersPayload);
		Response response=requestspec.post();
		response.prettyPrint();
		
		//validate the status code
		Assert.assertEquals(response.statusCode(), 201,"Checking status code");
		
		
	}

}
