package switchcasepractice;

public class switchaseassignment {

	public static void main(String[] args) {
		/*WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		char alphabet='a';
		switch (alphabet) {
		case 'a':
			System.out.println(alphabet + "is vowel");
			break;
			
		case 'e':
			System.out.println(alphabet +"is vowel");
			break;
		case 'i':
			System.out.println(alphabet +"is vowel");
			break;
		case 'o':
			System.out.println(alphabet +"is vowel");
			break;
		case 'u':
			System.out.println(alphabet +"is vowel");
			break;
			
		default:
			System.out.println(alphabet +"is consonent");
			
		}
		*/
		//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case

		
		String env="qa";
		switch (env) {
		case "qa":
			System.out.println("Welcome in the qa enviornment");
			
		case "dev":
			System.out.println("Welcome in the dev enviornment");
		
		case "stage":
			System.out.println("Welcome in the stage enviornment");
			
		case "UAT":
			System.out.println("Welcome in the UAT enviornment");
		
		case "prod":
			System.out.println("Welcome in the Prod enviornment");
		break;
					default:
			System.out.println("Please provide valid enviornment");
	}

	}
}
