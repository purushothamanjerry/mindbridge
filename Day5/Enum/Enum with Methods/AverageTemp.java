package day4;

public class AverageTemp {

	public static void main(String[] args) {
		
		for (Season season : Season.values()) {
            System.out.println("The average temperature in " + season + " is " + season.getAverageTemperature() + "°C.");
        }

	}

}
