package session10;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthrizationAPIKey {
	//https://api.openweathermap.org/data/2.5/weather?q=delhi
	@Test
	public void getWeatherByCity()
	{
		RequestSpecification reqestSpec=RestAssured.given();
		reqestSpec.baseUri("//https://api.openweathermap.org");
		reqestSpec.basePath("data/2.5/weather");
		reqestSpec.queryParam("q", "delhi").queryParam("appid", "566be371a97a11b1763b0cdaaca945d8");
		Response response=reqestSpec.get();
		System.out.println("Status Code:"+response.statusCode());
		System.out.println("Status line:"+response.statusLine());
	
		Assert.assertEquals(response.statusCode(), 200);
		System.out.println("Response Body :"+response.body());
	}

}
