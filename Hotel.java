package workshop;

class Hotel {
	public int rate;
	private String hotelName;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String string) {
		this.hotelName = string;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int num) {
		this.rate = num;
	}
	

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");

		Hotel lakewood = new Hotel();
		lakewood.setHotelName("Lakewood");
		lakewood.setRate(110);
		System.out.println("Hotel Name is" + lakewood.getHotelName());
		System.out.println("Rate for Regular customer is : " + lakewood.getRate());

		Hotel bridgewood = new Hotel();
		bridgewood.setHotelName("Bridgewood");
		bridgewood.setRate(160);
		System.out.println("Hotel Name is" + bridgewood.getHotelName());
		System.out.println("Rate for Regular customer is :" + bridgewood.getRate());

		Hotel ridgewood = new Hotel();
		ridgewood.setHotelName("Bridgewood");
		ridgewood.setRate(220);
		System.out.println("Hotel Name is" + ridgewood.getHotelName());
		System.out.println("Rate for Regular customer is : " + ridgewood.getRate());
	}

}
