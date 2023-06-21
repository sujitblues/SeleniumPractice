package session18;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FileUploadDemo {
	
	@Test
	public void singleFileUpload()
	{
		//create file object
		
		File testFileUpload=new File("D:\\file upload\\test.txt");
		
		//create Request Specfication
		RequestSpecification requestSpec=RestAssured.given();
		
		//Specify url
		requestSpec.baseUri("http://httpbin.org/post");
		
		requestSpec.multiPart("file",testFileUpload);
		requestSpec.contentType("multipart/form-data");
		
		//perform post request
		Response response=requestSpec.post();
		
		//print response body
		response.prettyPrint();
		
		//validate status code
		Assert.assertEquals(response.statusCode(), 200,"checking the status code");
	}

	@Test
	public void MultipleFileupload()
	{
		//create file object
		
		File testFileUpload=new File("D:\\file upload\\test.txt");
		File testFileUpload2=new File("D:\\file upload\\testFileUpload.txt");
		//create Request Specfication
		RequestSpecification requestSpec=RestAssured.given();
		
		//Specify url
		requestSpec.baseUri("http://httpbin.org/post");
		
		requestSpec.multiPart("files",testFileUpload);
		requestSpec.multiPart("files",testFileUpload2);
		requestSpec.contentType("multipart/form-data");
		
		//perform post request
		Response response=requestSpec.post();
		
		//print response body
		response.prettyPrint();
		
		//validate status code
		Assert.assertEquals(response.statusCode(), 200,"checking the status code");
	}
	
	@Test
	public void uploadImage()
	{
		//https://petstore.swagger.io/v2/pet/1/uploadImage
		//create file object
		
				File testFileUpload=new File("D:\\file upload\\Cute-Dog-Images.jpg");
				
				//create Request Specfication
				RequestSpecification requestSpec=RestAssured.given();
				
				//Specify url
				requestSpec.baseUri("https://petstore.swagger.io/v2/pet/1/uploadImage");
				
				requestSpec.multiPart("file",testFileUpload);
				
				requestSpec.contentType("multipart/form-data");
				
				//perform post request
				Response response=requestSpec.post();
				
				//print response body
				response.prettyPrint();
				
				//validate status code
				Assert.assertEquals(response.statusCode(), 200,"checking the status code");

	}

}
