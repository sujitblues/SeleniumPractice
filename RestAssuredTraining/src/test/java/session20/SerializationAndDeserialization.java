package session20;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class SerializationAndDeserialization {
	@Test
	public void CreatJSONObjectFromEmployeeClassObject() throws JsonProcessingException
	{
		Employee emp1=new Employee();
		emp1.setFirstname("sujit");
		emp1.setLastname("kumar");
		emp1.setAge(35);
		emp1.setGender("male");
		emp1.setSalary(80000);
		
		//Convert employee class object to json payload as string
		
		ObjectMapper objMapper=new ObjectMapper();
		String employeeJSON=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
		System.out.println(employeeJSON);
		
		
		//http://httpbin.org/post

		RequestSpecification requestSpec=RestAssured.given();
		requestSpec.baseUri("http://httpbin.org/post");
		requestSpec.contentType(ContentType.JSON);
		requestSpec.body(employeeJSON);
		
		//perform post request
		Response response=requestSpec.post();
		response.prettyPrint();
		
		//Validate
		Assert.assertEquals(response.statusCode(), 200,"Checking the status code");
		
		
		//convert JSON string(employeeJSON) to class object
		Employee emp2=objMapper.readValue(employeeJSON, Employee.class);
		
		System.out.println("Print after JSON to class object");
		System.out.println("FirstName:"+ emp2.getFirstname());
		System.out.println("FirstName:"+ emp2.getLastname());
		System.out.println("FirstName:"+ emp2.getGender());
		System.out.println("FirstName:"+ emp2.getAge());
		System.out.println("FirstName:"+ emp2.getSalary());
		
		
	}
	

}
