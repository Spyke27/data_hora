package app;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Program {

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat brDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println(brDateFormat.format(date));

		/* LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		System.out.println("Data: "+d01);
		System.out.println("Data e hora: "+d02);
		System.out.println("Instante atual em Londres: "+d03); */
		
	}

}
