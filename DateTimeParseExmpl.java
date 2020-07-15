package dtparse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeParseExmpl {

	public static void main(String[] args) {
		
		args[0] = "2020-07-14 03:54:26 AM";
		LocalDateTime localDT = null;
		DateTimeFormatter myFormatObj;
		try {

			myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssa");
			localDT = LocalDateTime.parse(args[0], myFormatObj);

		} catch (DateTimeParseException ex) {
			System.out.println("wrong date pattern shoud be of dd-MM-yyyy HH:mm:ss:a ");
		}
		//DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
		/*myFormatObj = builder.appendText(ChronoField.DAY_OF_MONTH, TextStyle.NARROW)
				.appendText(ChronoField.MONTH_OF_YEAR, TextStyle.FULL).appendPattern("uuu").appendPattern("kk")
				.appendText(ChronoField.MINUTE_OF_HOUR, TextStyle.NARROW_STANDALONE).toFormatter();
		localDT.format(myFormatObj);*/
		try {
		System.out.println("word equivalent of date " + localDT.toLocalDate());
		System.out.println("After formatting: time " + localDT.toLocalTime());
		System.out.println("After formatting: week-" + localDT.getDayOfWeek());
		} catch (Exception ex) {
			
		}
		
	}
	
	//test the Input String 
	public void parseDateTimeInput(String args) throws DateTimeParseException {

			DateTimeFormatter myFormatObj;
			LocalDateTime localDT = null;
			myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssa");
			localDT = LocalDateTime.parse(args, myFormatObj);
					
	}

}
