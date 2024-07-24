package speed_converter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter speed in kilometer per hour: ");
		double kilometerPerHour = sc.nextDouble();
		
		System.out.print("Enter speed in meters per hour: ");
		double metersPerSecond = sc.nextDouble();
		
		System.out.println("Kilometer to meters per second: " + String.format("%.1f", kilometersToMetersPerSecond(kilometerPerHour)));
		System.out.println("Meters per second to kilometer per hour: " + String.format("%.1f", metersToKilometersPerHour(metersPerSecond)));
		
		sc.close();
	}
	
	static double kilometersToMetersPerSecond(double km) {
		double ms = 0.0;
		ms = km / 3.6;
		return ms;
	}
	
	static double metersToKilometersPerHour(double ms) {
		double km = 0.0;
		km = ms * 3.6;
		return km;
	}
}