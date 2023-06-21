package day5;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class xmlParsingResponse {
	
	@Test
	public void testXMLResponse1()
	{
		//http://restapi.adequateshop.com/api/Traveler?page=1
		given()
		.when()
		.get("http://restapi.adequateshop.com/api/Traveler?page=1")
		.then()
		.statusCode(200)
		.header("Content-Type", "application/xml; charset=utf-8")
		.body("TravelerinformationResponse.page", Matchers.equalTo("1"))
		.body("TravelerinformationResponse.travelers.Travelerinformation[0].name", Matchers.equalTo("Developer"));
	}
	@Test
	public void testXMLResponse2()
	{
		//http://restapi.adequateshop.com/api/Traveler?page=1
		Response response=given()
		.when()
		.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.header("Content-Type"),"application/xml; charset=utf-8");
		String pageNo=response.xmlPath().get("TravelerinformationResponse.page");
		Assert.assertEquals(pageNo, "1");
		String TravelerName=response.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[0].name");
		Assert.assertEquals(TravelerName, "Developer");
		
	}
	
	@Test
	void testXMLResponseBody()
	{
		Response response=given()
				.when()
				.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		XmlPath xpath=new XmlPath(response.asString());
		List<String>travellers=xpath.getList("TravelerinformationResponse.travelers.Travelerinformation");
		Assert.assertEquals(travellers.size(), 10);
				
		//verify traveller name is present in response or not
		List<String>travellerName=xpath.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
	boolean found=false;
	for(String Name:travellerName)
	{
		if(Name.equals("Developer"))
		{
			found=true;
					break;
		}
	}
	Assert.assertEquals(found, true);
	}

}
