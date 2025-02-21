package ar.edu.unlp.objetos.uno.Ejercicio14;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	//private static final ChronoUnit DAYS
	
	
	public boolean setFrom (int ano, int mes, int dia) {
		try {
			from = LocalDate.of(ano, mes, dia);
			return true;
		} catch (DateTimeException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean setTo (int ano, int mes, int dia) {
		try {
			to = LocalDate.of(ano, mes, dia);
			return true;
		} catch (DateTimeException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public LocalDate getFrom() {
	return from;
	}
	
	public LocalDate getTo() {
		return to;
	}
	
	public int sizeInDays() {
		
		return (int) from.until(to, ChronoUnit.DAYS);
	}

	
	public boolean includesDate (LocalDate other) {
		return from.isBefore(other) && to.isAfter(other);
	}
}
