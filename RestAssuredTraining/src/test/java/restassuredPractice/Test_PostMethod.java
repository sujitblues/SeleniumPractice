package restassuredPractice;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PostMethod {
	@Test
	public void test03()
	{
		JSONObject jsonData=new JSONObject();
		
		jsonData.put("name", "sujit");
		jsonData.put("job", "Testing");
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.log().all()
		.body(jsonData.toString())
		.when().post()
		.then().statusCode(201)
		.log().all();
		
	}

}
