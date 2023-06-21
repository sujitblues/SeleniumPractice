package restassuredPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

//import io.restassured.RestAssured;-use static to avoid calling everytime RestAssured class name
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Test_GetMethod {
	@Test
	public void test01()
	{
		//Response res=RestAssured.get("https://reqres.in/api/users?page=2"); //it will use when RestAssured package is not imported as static package.
		Response res=get("https://reqres.in/api/users?page=2");
		System.out.println(res.asString());
		System.out.println("Status Code"+" "+res.statusCode());
		System.out.println("Respnse Body"+" "+ res.getBody().asString());
		System.out.println("Response Time"+" "+ res.getTime());
		System.out.println("Header"+" "+res.getHeader("Content-Type"));
		
		//validate the response
		//validate the status code
		int expectedStatusCode=200;
		int actualStatusCode=res.statusCode();
		Assert.assertEquals(expectedStatusCode, actualStatusCode);
		
		
	}
	@Test
	public void test02()
	{
		//given when then
		//RestAssured.baseURI="https://reqres.in/api/users";
		//RestAssured.given().queryParam("page", 2)
		//baseURI="https://reqres.in/api/users";
		given().queryParam("page", 2)
		.when().get("https://reqres.in/api/users")
		.then().statusCode(200);
	}

}
