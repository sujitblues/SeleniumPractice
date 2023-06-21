package studentAPIChaining;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class updateStudent {
	@Test
	void test_updateUser(ITestContext context)
	{
		//Faker faker=new Faker();
		HashMap<String,Object> userpayload=new HashMap<String,Object>();
		userpayload.put("name","sujit kumar");
		userpayload.put("location","India");
		userpayload.put("phone","9876452345");
		ArrayList<String> courses=new ArrayList<String>();
		courses.add("Cypress");
		courses.add("Rest-Assured");
		userpayload.put("courses", courses);
		
		int id=(Integer) context.getSuite().getAttribute("user_id");
		RestAssured.given()
				.baseUri("http://localhost:3000")
				.contentType(ContentType.JSON)
				.pathParam("id", id)
				.body(userpayload)
				.log().all()
				.put("/students/{id}")
				.then()
				.log().ifError()
				.statusCode(200);
						
	}

}
