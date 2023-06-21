package day8;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class updateUser {
	
		
		@Test
		void test_updateUser(ITestContext context)
		{
			Faker faker=new Faker();
			JSONObject data=new JSONObject();
			data.put("name",faker.name().fullName());
			data.put("gender", "Male");
			data.put("email", faker.internet().emailAddress());
			data.put("status", "active");
			
			String bearerToken="d5d779128023f02e0ce72dc8ba259d7cbf43aa0248590ac7bd62618873e2b6dd";
			//This is available at test level
			//int id=(Integer) context.getAttribute("user_id"); //This should come from createUser request
			//System.out.println(id);
			int id=(Integer) context.getSuite().getAttribute("user_id");//This available at suite level
			given()
				.header("Authorization","Bearer "+bearerToken)
				.log().all()
				.contentType("application/json")
				.body(data.toString())
				.pathParam("id", id)
			.when()
				.put("https://gorest.co.in/public/v2/users/{id}")
				
			.then()
				.statusCode(200)
				.log().all();
			
			
			
		
			
		}


}
