package studentAPIChaining;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class createStudent {
	@Test
	public void create(ITestContext context)
	{
		
			HashMap<String,Object> userpayload=new HashMap<String,Object>();
			userpayload.put("name","sujit");
			userpayload.put("location","India");
			userpayload.put("phone","9866745234");
			ArrayList<String> courses=new ArrayList<String>();
			courses.add("Cypress");
			courses.add("Rest-Assured");
			userpayload.put("courses", courses);
			
			int id=RestAssured.given()
					.baseUri("http://localhost:3000/students")
					.contentType(ContentType.JSON)
					.body(userpayload)
					.log().all()
					.post()
					.jsonPath().getInt("id");
					
			System.out.println("Generated id "+id);
			//context.setAttribute("user_id", id);//This is available at test level
			context.getSuite().setAttribute("user_id", id); //This is available at suite level
			
				

	}

}
