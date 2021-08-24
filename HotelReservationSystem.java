package workshop;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
	static List<Hotels> list = new ArrayList<>();

	// Displaying Hotels with its rates
	public static void showHotels() {
		for (Hotels i : list) {
			System.out.println(i.name + " " + i.weekdayRate);
		}

	}

	// finding Cheapest hotels
	private static void findCheapestHotel(int lakwoodWeekdayRate, int briwoodWeekdayRate, int ridgewodWeekdayRate) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter start date");
		String startDate1 = s.nextLine();
		System.out.println(startDate1);
		System.out.println("Enter end date");
		String endDate2 = s.nextLine();
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("ddMMyyyy");
		LocalDate startDate = LocalDate.parse(startDate1, formatDate);
		LocalDate endDate = LocalDate.parse(endDate2, formatDate);
		long days = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(days);
		s.close();

		long lakewoodWeekdayRate = days * lakwoodWeekdayRate;
		long bridgewoodWeekdayRate = days * briwoodWeekdayRate;
		long ridgewoodWeekdayRate = days * ridgewodWeekdayRate;
		if (lakewoodWeekdayRate < bridgewoodWeekdayRate && lakewoodWeekdayRate < ridgewoodWeekdayRate) {
			System.out.println("Cheapest Hotel is  lakewood and rate is " + lakewoodWeekdayRate);

		} else if (bridgewoodWeekdayRate < lakewoodWeekdayRate && bridgewoodWeekdayRate < ridgewoodWeekdayRate) {
			System.out.println("Cheapest Hotel is bridgewoodand rate is " + bridgewoodWeekdayRate);
		} else {
			System.out.println("Cheapest Hotel is ridgewood and rate is " + ridgewoodWeekdayRate);
		}
	}

	public static void main(String[] args) {
		Hotels lakewood = new Hotels("Lakewood", 110);
		Hotels bridgewood = new Hotels("Bridgewood", 160);
		Hotels ridgewood = new Hotels("Ridgewood", 220);

		list.add(lakewood);
		list.add(bridgewood);
		list.add(ridgewood);

		showHotels();
		findCheapestHotel(lakewood.weekdayRate, bridgewood.weekdayRate, ridgewood.weekdayRate);

	}
}
