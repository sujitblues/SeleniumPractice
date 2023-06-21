import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		
		JsonPath js=new JsonPath(payload.CoursePrice());
		//1.Print No of courses returned by API
		int count=js.getInt("courses.size()");
		System.out.println(count);
		//2.Print Purchase Amount
		System.out.println("2.Print Purchase Amount");
		
		int totalAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println("TotalAmount : "+totalAmount);
		//3.Print Title of the first course
		String firstCourseTitle=js.get("courses[0].title");
		System.out.println(firstCourseTitle);
		//4.Print all course titles and their respective Prices
		System.out.println("4.Print all course titles and their respective Prices");
		for(int i=0;i<count;i++)
		{
			/*
			String courseTitles=js.get("courses["+i+"].title");
			int prices=js.get("courses["+i+"].price");
			System.out.println("CourseTitle "+ courseTitles +"Prices"+prices);
			*/
			//Another way
			System.out.println("Course" + js.get("courses["+i+"].title").toString());
			
			System.out.println("Price" + js.get("courses["+i+"].price").toString());
		}
		System.out.println("5.Print No of copies sold by RPA course");
		for(int i=0;i<count;i++)
		{
			String courseTitles=js.get("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("RPA"))
			{
				int copies=js.get("courses["+i+"].copies");
				System.out.println(copies);
				break;
			}
			}
		}
	
		
		//6.Verify if sum of all course prices matches with purchase amount
	
	
	

	}


