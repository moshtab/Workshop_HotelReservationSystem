package workshop;

import java.util.ArrayList;
import java.util.List;

class Hotels {
	String name;
	int weekdayRate;

	public Hotels(String Nname, int num) {
		this.name = Nname;
		this.weekdayRate = num;
	}
}

public class HotelReservationSystem {

	public static void main(String[] args) {
		Hotels lakewood = new Hotels("Lakewood", 110);
		Hotels bridgewood = new Hotels("Bridgewood", 160);
		Hotels ridgewood = new Hotels("Ridgewood", 220);

		List<Hotels> list = new ArrayList<>();
		list.add(lakewood);
		list.add(bridgewood);
		list.add(ridgewood);

		// Displaying Hotels with its rates
		System.out.println("Showing Hotels and its weekday rates");
		for (Hotels i : list) {
			System.out.println(i.name + " " + i.weekdayRate);
		}

		// finding Cheapest hotels
		if (lakewood.weekdayRate < bridgewood.weekdayRate && lakewood.weekdayRate < ridgewood.weekdayRate) {
			System.out.println("Cheapest Hotel is " + lakewood.name + "and rate is " + lakewood.weekdayRate);

		} else if (bridgewood.weekdayRate < lakewood.weekdayRate && bridgewood.weekdayRate < ridgewood.weekdayRate) {
			System.out.println("Cheapest Hotel is " + bridgewood.name + "and rate is " + bridgewood.weekdayRate);
		} else {
			System.out.println("Cheapest Hotel is " + ridgewood.name + "and rate is " + ridgewood.weekdayRate);
		}

	}

}
