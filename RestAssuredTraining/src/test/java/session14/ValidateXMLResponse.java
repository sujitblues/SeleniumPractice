package session14;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ValidateXMLResponse {
	
	@Test
	public void GetTravellerData()
	{
		//'http://restapi.adequateshop.com/api/Traveler?page=1'
		//RequestSpecification is interface
		// RestAssured.given return RequestSpecification 
		RequestSpecification requetSpec= RestAssured.given();
		requetSpec.baseUri("http://restapi.adequateshop.com");
		requetSpec.basePath("/api/Traveler");
		requetSpec.queryParam("page", "1");
		//headers
		requetSpec.header("accept","application/xml");//for xml response
		Response response=requetSpec.get();
		response.prettyPrint();
		
		//1st approch 
		response.then().body("TravelerinformationResponse.travelers.Travelerinformation[3].name", Matchers.equalTo("Developer123"));
		
		//2nd approch
		XmlPath objeXmlPath=new XmlPath(response.asString());
		String travellerName=objeXmlPath.get("TravelerinformationResponse.travelers.Travelerinformation[3].name").toString();
		Assert.assertEquals(travellerName, "Developer123","Checking for traveller Name");
		
		//verify toatal traverls to be 10
		
		List<String>listOfTravellers=objeXmlPath.getList("TravelerinformationResponse.travelers.Travelerinformation");
		int totalTravlerCount=listOfTravellers.size();
		Assert.assertEquals(totalTravlerCount, 10,"Check for total no of traveler count on page 1");
		
		//verify for name vano in travellers list
		List<String>listOfTravellersName=objeXmlPath.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		
		//print all the names in the travellers list
		boolean found=false;
		for(String traverller :listOfTravellersName)
		{
			System.out.println(traverller);
			if(traverller.equals("vano"))
			{
				found=true;
				break;
			}
		}
		Assert.assertEquals(found, true);
	}
	
	@Test(enabled=false)
	public void AddPet()
	{
		String xmlData="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
				+ "<Pet>\r\n"
				+ "	<id>0</id>\r\n"
				+ "	<Category>\r\n"
				+ "		<id>0</id>\r\n"
				+ "		<name>string</name>\r\n"
				+ "	</Category>\r\n"
				+ "	<name>doggie</name>\r\n"
				+ "	<photoUrls>\r\n"
				+ "		<photoUrl>string</photoUrl>\r\n"
				+ "	</photoUrls>\r\n"
				+ "	<tags>\r\n"
				+ "		<Tag>\r\n"
				+ "			<id>0</id>\r\n"
				+ "			<name>string</name>\r\n"
				+ "		</Tag>\r\n"
				+ "	</tags>\r\n"
				+ "	<status>available</status>\r\n"
				+ "</Pet>";
		
		String jsonData="{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}";
		//RequestSpecification is interface
		// RestAssured.given return RequestSpecification 
		RequestSpecification requetSpec= RestAssured.given();
		//https://petstore.swagger.io/#/pet/addPet
		requetSpec.baseUri("https://petstore.swagger.io");
		requetSpec.basePath("/v2/pet");
		
		//headers
		//requetSpec.header("accept","application/json");//for json response
		requetSpec.header("accept","application/xml");//for xml response
		//requetSpec.header("Content-Type","application/json");//for json body
		requetSpec.header("Content-Type","application/xml");
		//Specify body
		//requetSpec.body(jsonData);//json body
		requetSpec.body(xmlData);//xml body
		Response response=requetSpec.post();
		response.prettyPrint();
		//Assertion 
		
		Assert.assertEquals(response.statusCode()/*actual status code */, 200,"Checking status code");
		response.then().body("pet.name", Matchers.equalTo("doggie"));
		
		
		
	}

}
