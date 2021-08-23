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
		System.out.println("Welcome to Hotel Reservation Systel Program");
		Hotels lakewood = new Hotels("Lakewood", 110);
		Hotels bridgewood = new Hotels("Bridgewood", 160);
		Hotels ridgewood = new Hotels("Ridgewood", 220);

		List<Hotels> list = new ArrayList<>();
		list.add(lakewood);
		list.add(bridgewood);
		list.add(ridgewood);

		for (Hotels i : list) {
			System.out.println(i.name + " " + i.weekdayRate);
		}
	}

}
