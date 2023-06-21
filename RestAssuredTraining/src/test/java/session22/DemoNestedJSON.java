package session22;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoNestedJSON {
	
	@Test
	public void  createUser() throws JsonProcessingException
	{
		
		/*
		 * { "firstName":"Ramesh", "lastName":"Patel", "gender":"Male", "age":35,
		 * "salary":1000.45, "Address":{ "Street":"Dugal Colony", "City":"South Delhi",
		 * "State":"New Delhi", "pincode":110044
		 * 
		 * }
		 */
		EmployeePOJO emp1=new EmployeePOJO();
		emp1.setFirstName("Rames");
		emp1.setLastName("Patel");
		emp1.setGender("Male");
		emp1.setAge(35);
		emp1.setSalary(10000.56);
		EmployeeAddress emp1Address=new EmployeeAddress();
		emp1Address.setStreet("Dugal Colony");
		emp1Address.setCity("South Delhi");
		emp1Address.setState("New Delhi");
		emp1Address.setPincode(110044);
		emp1.setAddress(emp1Address);
		//convert class object to json object as string
		ObjectMapper objectMapper=new ObjectMapper();
		String jsonpaylod=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
		//String jsonpaylod=objectMapper.writeValueAsString(emp1);
		//System.out.println(jsonpaylod);
		RequestSpecification reqSpec=RestAssured.given();
		
		//specify url
		reqSpec.baseUri("http://httpbin.org/post");
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(jsonpaylod);
		
		//perform post request
		Response response=reqSpec.post();
		//reponse print
		response.prettyPrint();
		
		
	}

}
