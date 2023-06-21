package DateConcept;

import java.time.format.DateTimeFormatter;

public class DateTest {

	public static void main(String[] args) {
		System.out.println(java.time.LocalDate.now());
System.out.println(java.time.LocalDate.now().getDayOfMonth());
	System.out.println(java.time.LocalDate.now().getDayOfYear());
	
	System.out.println(java.time.LocalTime.now());
	System.out.println(java.time.LocalDateTime.now());
	System.out.println(java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-YYYY")));
	System.out.println(java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("dd/mm/YYYY")));
	
	System.out.println(java.time.LocalDate.now().minusDays(10));
	System.out.println(java.time.LocalDate.now().lengthOfMonth());
	
	}

}
