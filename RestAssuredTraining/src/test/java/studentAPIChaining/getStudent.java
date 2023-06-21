package studentAPIChaining;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class getStudent {
	@Test
	void test_getuser(ITestContext context)
	{
		//This is available at test level
		//int id=(Integer) context.getAttribute("user_id"); //This should come from createUser request
		
		int id=(Integer) context.getSuite().getAttribute("user_id");//This available at suite level
		given()
		.pathParam("id", id)
					.log().all()
		.when()
			.get("http://localhost:3000/students/{id}")
		.then()
			.statusCode(200)
			.log().all();
			
			
		
	}

}
