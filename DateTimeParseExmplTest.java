package dtparse;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.DateTimeException;

import org.junit.jupiter.api.Test;


class DateTimeParseExmplTest {

	@Test ()
	void test() {
	
		 DateTimeParseExmpl dtParse = new DateTimeParseExmpl();
				
		assertThrows(DateTimeException.class, () -> dtParse.parseDateTimeInput("2020-07-14 03:54:26 AM"), "invalid dateinput"); 
		
	}

}
