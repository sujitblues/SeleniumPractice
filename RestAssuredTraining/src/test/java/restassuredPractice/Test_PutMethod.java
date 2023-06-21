package restassuredPractice;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PutMethod {
@Test
	public void test04()
	{
	JSONObject jsonData=new JSONObject();
	
	jsonData.put("name", "sujit kumar");
	jsonData.put("job", "Testing");
	RestAssured.baseURI="https://reqres.in/api/users/70";
	RestAssured.given().header("Content-Type","application/json")
	.contentType(ContentType.JSON)
	.log().all()
	.body(jsonData.toString())
	.when().put()
	.then().statusCode(200)
	.log().all();
	}
}
