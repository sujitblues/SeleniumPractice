package day8;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class getUser {
	
	@Test
	void test_getuser(ITestContext context)
	{
		//This is available at test level
		//int id=(Integer) context.getAttribute("user_id"); //This should come from createUser request
		
		int id=(Integer) context.getSuite().getAttribute("user_id");//This available at suite level
		String bearerToken="d5d779128023f02e0ce72dc8ba259d7cbf43aa0248590ac7bd62618873e2b6dd";
		given()
			.header("Authorization","Bearer "+bearerToken)
			.pathParam("id", id)
			.log().all()
		.when()
			.get("https://gorest.co.in/public/v2/users/{id}")
		.then()
			.statusCode(200)
			.log().all();
			
			
		
	}

}
