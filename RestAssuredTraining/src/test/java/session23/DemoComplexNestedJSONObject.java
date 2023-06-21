package session23;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import session22.EmployeeAddress;
import session22.EmployeePOJO;

public class DemoComplexNestedJSONObject {
	
	@Test
	public void createUser() throws JsonProcessingException
		{
	/*	"CompanyName":"ABC ltd",
		"Street":"Africa Avenu",
		"City":"South Delhi"
		"State":"New Delhi",
		"pincode":110056,
		"BankAccounts":["HDFC","SBI","AXIS"],*/
		NestedJSONPojoClass requestPayload=new NestedJSONPojoClass();
		requestPayload.setCompanyName("ABC ltd");
		requestPayload.setStreet("Africa Avenu");
		requestPayload.setCity("South Delhi");
		requestPayload.setState("New Delhi");
		requestPayload.setPincode("110056");
		
		List<String> banks=new ArrayList<String>();
		banks.add("HDFC");
		banks.add("SBI");
		banks.add("AXIS");
		requestPayload.setBankAccount(banks);
		EmployeePOJO emp1=new EmployeePOJO();
		EmployeePOJO emp2=new EmployeePOJO();
		EmployeePOJO emp3=new EmployeePOJO();
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
		
		emp2.setFirstName("Rames");
		emp2.setLastName("Patel");
		emp2.setGender("Male");
		emp3.setAge(35);
		emp3.setSalary(10000.56);
		emp1Address.setStreet("Dugal Colony");
		emp1Address.setCity("South Delhi");
		emp1Address.setState("New Delhi");
		emp1Address.setPincode(110044);
		emp2.setAddress(emp1Address);
		
		emp3.setFirstName("Rames");
		emp3.setLastName("Patel");
		emp3.setGender("Male");
		emp3.setAge(35);
		emp3.setSalary(10000.56);
		emp1Address.setStreet("Dugal Colony");
		emp1Address.setCity("South Delhi");
		emp1Address.setState("New Delhi");
		emp1Address.setPincode(110044);
		emp3.setAddress(emp1Address);
		
		List<EmployeePOJO> employees=new ArrayList<EmployeePOJO>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		requestPayload.setEmployeeList(employees);
		//convert class object to jSon object as string
		ObjectMapper objectMapper =new ObjectMapper();
		String payload=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(requestPayload);
		//System.out.println(payload);
		
		//System.out.println(jsonpaylod);
				RequestSpecification reqSpec=RestAssured.given();
				
				//specify url
				reqSpec.baseUri("http://httpbin.org/post");
				reqSpec.contentType(ContentType.JSON);
				reqSpec.body(payload);
				
				//perform post request
				Response response=reqSpec.post();
				//print response Body
				response.prettyPrint();
				
				Assert.assertEquals(response.statusCode(), 200,"Checking for status code");
				
	}
	

}
