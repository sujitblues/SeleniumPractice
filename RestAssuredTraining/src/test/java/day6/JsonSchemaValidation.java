package day6;

import org.testng.annotations.Test;
import io.restassured.module.jsv.JsonSchemaValidator;
import static io.restassured.RestAssured.*;

public class JsonSchemaValidation {
	
   @Test
	public void jsonschemavalidation()
	{ 
	   given()
	   .when()
	   .get("https://reqres.in/api/users?page=2")
	   .then()
	   .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("listuser.json"));
	   
		
	}
}
