package LearningDay14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//Adding months:
		LocalDate plusMonth = date.plusMonths(2);
		System.out.println(plusMonth);
		//Subtract days:
		LocalDate subDay = date.minusDays(6);
		System.out.println(subDay);
		
	}

}
