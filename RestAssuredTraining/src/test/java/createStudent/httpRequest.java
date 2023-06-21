package createStudent;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;

public class httpRequest {

	public class httpRequest2 {
		
		@Test()
		public void createStudent()
		{
			HashMap<String,Object> userpayload=new HashMap<String,Object>();
			userpayload.put("name", "Lucky");
			userpayload.put("location", "New Delhi");
			userpayload.put("phone", "9876554");
			ArrayList<String> courses=new ArrayList<String>();
			courses.add("Cypress");
			courses.add("Rest-Assured");
			userpayload.put("courses", courses);
			
			Response response=RestAssured.given()
					.baseUri("http://localhost:3000/students")
					.contentType(ContentType.JSON)
					.body(userpayload)
					.post();
					response.prettyPrint();
					//verify status code
					int time=(int) response.time();
					if(time<50)
					{
						System.out.println("Time checking :PASS");
					}
					else
					{
						System.out.println("Time checking : FAIL");
					}
					
					Assert.assertEquals(response.statusCode(), 201,"check for status code");
			
		}
		
		

	}

}
