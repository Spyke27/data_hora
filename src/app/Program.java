package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		//DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		System.out.println("Data: "+d01);
		System.out.println("Data e hora: "+d02);
		System.out.println("Instante atual em Londres: "+d03);
		
	}

}
