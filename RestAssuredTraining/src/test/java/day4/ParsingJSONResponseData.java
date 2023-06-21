package day4;
import org.testng.Assert;
import  org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;


public class ParsingJSONResponseData {

	@Test
	void testJsonResponse()
	{
		//Apporach 1
		/*
		given()
			.contentType("ContentType.JSON")
		.when()
			.get("http://localhost:3000/books")
		.then()
			.statusCode(200)
			.header("Content-Type","application/json")
			.body("books[3].title",equalTo("The lord of the Rings"));
			*/
		
		//Approach2
		Response response=given()
			.contentType(ContentType.JSON)
		.when()
			.get("http://localhost:3000/books");
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.header("Content-Type"),"application/json");
		String bookname=response.jsonPath().get("book[3].title").toString();
		Assert.assertEquals(bookname, "The Lord of the Rings");
	}
	@Test
	void testJsonResponseBodyData()
	{
		Response response=given()
			.contentType(ContentType.JSON)
		.when()
			.get("http://localhost:3000/books");	
		boolean status=false;
		//JSONObject 
		JSONObject jo=new JSONObject(response.toString());//converting response to json object type
		for(int i=0;i<jo.getJSONArray("books").length();i++)
		{
			String bookTitle=jo.getJSONArray("books").getJSONObject(i).get("title").toString();
			if(bookTitle.equals("The Lord of the Rings"))
			{
				status=true;
				break;
			}
			
			//System.out.println(bookTitle);
		}
	}
}
