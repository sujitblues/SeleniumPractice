package session15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonObjectUsingMap {
	//https://restful-booker.herokuapp.com/apidoc/index.html

	@Test
	public void createAuth()
	{
		/*
		"username":"admin",
		"password":"password123"
		*/
		Map<String,String> authToken=new HashMap<String,String>();
		authToken.put("username", "admin");
		authToken.put("password", "password123");
		Response response=RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com/auth")
		.contentType(ContentType.JSON)
		.body(authToken)
		.post();
		response.prettyPrint();
		//verify status code
		Assert.assertEquals(response.statusCode(), 200,"check for status code");
			
		}
	@Test
	public void createUser()
	{
		/*
		{
			"firstName": "Amod",
			"lastName": "Mahajan",
			"age": 28,
			"salary": 1000.56,
			"IsMarried": true,
			"Hobbies": ["Music", "Computer", "Games"],
						"TechSkill": {
				"Programming language":"Java",
				"WebAutomation": "Selenium",
				"API Testing": "Rest Assured"
			}
		}
		*/
		HashMap<String,Object> UserData=new HashMap<String, Object>();
		UserData.put("firstName", "Amod");
		UserData.put("lastName", "Mahajan");
		UserData.put("age", 30);
		UserData.put("Salary", 1000.56);
		UserData.put("IsMarried", true);
		
		ArrayList<String> hobbies=new ArrayList<String>();
		hobbies.add("Music");
		hobbies.add("Computer");
		hobbies.add("Games");
		UserData.put("Music",hobbies);
		
		HashMap<String,String> TechSkill=new HashMap<String,String>();
		
		TechSkill.put("Programming language", "Java");
		TechSkill.put("WebAutomation", "Selenium");
		TechSkill.put("API Testing", "Rest Assured");
		
		UserData.put("TechSkill", TechSkill);
		Response response=RestAssured.given()
				.baseUri("https://reqres.in/api/users")
				.contentType(ContentType.JSON)
				.body(UserData)
				.post();
				response.prettyPrint();
				//verify status code
				Assert.assertEquals(response.statusCode(), 201,"check for status code");
					
	}
	
}
