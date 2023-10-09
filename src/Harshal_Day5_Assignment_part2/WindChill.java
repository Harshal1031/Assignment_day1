package Harshal_Day5_Assignment_part2;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("Enter The Temperature::");
		double temperature = Utility.scannerdouble();
		System.out.println("Enter Wind Speed::");
		double wind = Utility.scannerdouble();
		effictiveTemperature(temperature, wind);

	}

	private static void effictiveTemperature(double temperature, double wind) {
		if (Math.abs(temperature) <= 50 && wind > 2 && wind < 121) {
			double w = 35.74 + (0.6125 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(wind, 0.16);
			System.out
					.println("National Weather Service defines the effective temperature (the wind chill) to be: " + w);
		} else {
			System.out.println("Not Valid");
		}
	}
}
