package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DiffWaysToCreatePostRequestBody {
	
	//1 post request body using HashMap
	
	@Test
	public void testPostusingHashMap()
	{
		HashMap<String,Object> data=new HashMap<String,Object>();
		data.put("name", "sujit");
		data.put("loaction", "New Delhi");
		data.put("phone", "987654567");
		String courseArr[]= {"C","C++"};
		data.put("courses", courseArr);
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("http://localhost:3000/students")
		.then()
		.statusCode(201)
		.header("Content-Type", "application/json; charset=utf-8");
		
	}
	//2 post request body using org.json library
	
	@Test
	public void testPostusingJsonLibrary()
	{
		JSONObject data=new JSONObject();
		data.put("name", "Manish");
		data.put("loaction", "New Delhi");
		data.put("phone", "987654567");
		String courseArr[]= {"C","C++"};
		data.put("courses", courseArr);
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("http://localhost:3000/students")
		.then()
		.statusCode(201)
		.header("Content-Type", "application/json; charset=utf-8");
		
	}
	//3 Post request body using pojo class
	@Test
	public void testPostusingPojo()
	{
		Pojo_PostRequest data =new Pojo_PostRequest();
		data.setName("Rahul");
		data.setLocation("Kolkata");
		data.setPhone("987654345");
		String courseArr[]= {"C","C++"};
		data.setCourses(courseArr);
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("http://localhost:3000/students")
		.then()
		.statusCode(201)
		.header("Content-Type", "application/json; charset=utf-8");
		
	}
	//4. create body using external json file
	@Test
	public void testPostusingExternalfile() throws FileNotFoundException
	{
File f=new File(".\\body.json");
FileReader fr=new FileReader(f);
JSONTokener jt=new JSONTokener(fr);
JSONObject data=new JSONObject(jt);
		given()
		.contentType("application/json")
		.body(data.toString())
		.when()
		.post("http://localhost:3000/students")
		.then()
		.statusCode(201)
		.header("Content-Type", "application/json; charset=utf-8");
		
	}

}
