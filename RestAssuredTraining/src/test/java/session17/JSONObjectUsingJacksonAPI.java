package session17;

import java.util.Iterator;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JSONObjectUsingJacksonAPI {
	//https://reqres.in/api/users
	/*	"firstName":"Ramesh",
		"lastName":"Patel",
		"gender":"Male",
		"age":35,
		"salary":1000.45,
		"Address":{
			"Street":"Dugal Colony",
			"City":"South Delhi",
			"State":"New Delhi",
			"pincode":110044

		}*/
	@Test
		public void creatUser() throws JsonProcessingException
		{
			//create ObjectMapper class instance
			ObjectMapper ObjectMapper=new ObjectMapper();
			
			//create object node /json node
			ObjectNode userDetails=ObjectMapper.createObjectNode();
			userDetails.put("firstName", "sujit");
			userDetails.put("lastName", "Kumar");
			userDetails.put("age", 35);
			userDetails.put("salary", 10000.89);
			userDetails.put("isMarried", true);
			ObjectNode techSkill=ObjectMapper.createObjectNode();
			techSkill.put("Programming language", "Java");
			techSkill.put("WebAutomation", "Selenium");
			techSkill.put("API Testing", "RestAssured");
			userDetails.set("TechSkill", techSkill);
			
			//print userDetails JSON object
			String userDetailsAsString=ObjectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(userDetails);
			System.out.println(userDetailsAsString);
			
			//Retrieve field value
			String firstName=userDetails.get("firstName").asText();
			System.out.println(firstName);
			//Boolean isMarried=userDetails.get("IsMarried").asBoolean();
			//System.out.println(isMarried);
			//retried field value of WebAutomation
			String WebAutomationValue=userDetails.get("TechSkill").get("WebAutomation").asText();
		System.out.println(WebAutomationValue);
		
		System.out.println("Print all fileds name");
		Iterator<String>fieldNameIterator=userDetails.fieldNames();
		while(fieldNameIterator.hasNext())
		{
			System.out.println(fieldNameIterator.next());
		}
		
		System.out.println("Print all fileds value");
		Iterator<JsonNode>fieldValueIterator=userDetails.elements();
		while(fieldNameIterator.hasNext())
		{
			System.out.println(fieldValueIterator.next());
		}
		System.out.println("Print all fileds value");
		Iterator<Entry<String,JsonNode>>keyValueEntries=userDetails.fields();
		while(fieldNameIterator.hasNext())
		{
			System.out.println(fieldValueIterator.next());
		}
		}

}
