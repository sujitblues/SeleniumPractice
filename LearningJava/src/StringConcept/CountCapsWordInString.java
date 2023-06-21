package StringConcept;

public class CountCapsWordInString {
	public static int getCapsWordsInString(String inputString) {

		int counter = 0;
		for(int i = 0; i < inputString.length(); i++) {
		if(inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
		counter++;
		}
		}
		return counter;
		}

	public static void main(String[] args) {
		
			System.out.println(getCapsWordsInString("RahulShettyAcademy"));
			}


	}


