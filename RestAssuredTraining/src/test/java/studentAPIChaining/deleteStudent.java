package studentAPIChaining;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class deleteStudent {
	@Test
	void test_deleteStudent(ITestContext context)
	{
			
		int id=(Integer) context.getSuite().getAttribute("user_id");
		RestAssured.given()
				.baseUri("http://localhost:3000")
				.contentType(ContentType.JSON)
				.pathParam("id", id)
				.log().all()
				.delete("/students/{id}")
				.then()
				.log().all()
				.statusCode(200);
				

	}
}
