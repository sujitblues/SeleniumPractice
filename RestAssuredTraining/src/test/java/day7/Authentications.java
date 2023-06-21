package day7;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Authentications {
	
	@Test(priority=1)
	void testBasicAuthentication()
	{
		
		given()
		.auth().basic("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
		.body("authenticated", equalTo(true))
		.statusCode(200)
		.log().all();
		
		
	}
	@Test(priority=2)
	void testDigestAuthentication()
	{
		
		given()
		.auth().digest("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
		.body("authenticated", equalTo(true))
		.statusCode(200)
		.log().all();
		
		
	}
	@Test(priority=3)
	void testPreemptivetAuthentication()
	{
		
		
		given()
		.auth().preemptive().basic("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
		.body("authenticated", equalTo(true))
		.statusCode(200)
		.log().all();
		
		
	}
	@Test(priority=4)
	void testBearerTokenAuthentication()
	{
		String token="29f8ffda0fbd160e70d8e7f1baca19773dfe14b8a23d3b48f2429a2e8a157d55";
		given()
		.headers("Authorization","Bearer " +token)
		.when().get("https://gorest.co.in/public/v2/users")
		.then()
		.statusCode(200)
		.log().all();
		
		
	}
	@Test(priority=5)
	void testOAuth1Authentication()
	{
		given()
		.auth().oauth("consumerkey", "consumerSecrat", "accessToken", "tokenSecrate")
		.when().get("url")
		.then()
		.statusCode(200)
		.log()
		.all();
	}
	
	@Test(priority=6)
	void testOAuth2Authentication()
	{
		given()
		.auth().oauth2("token")
		.when().get("url")
		.then()
		.statusCode(200)
		.log()
		.all();
	}
	
	@Test(priority=7)
	void testApiKeyAuthentication()
	{
		given()
			.queryParam("appid", "566be371a97a11b1763b0cdaaca945d8")
			.queryParam("q", "delhi")
		.when().get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.statusCode(200)
		.log()
		.all();
		
	}
	

}
