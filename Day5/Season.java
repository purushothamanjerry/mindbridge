package day4;

public enum Season {
	
	WINTER(-5),SPRING(15),SUMMER(30),FALL(10);
	

	private final int averageTemperature;
	private Season(int temp) {
	this.averageTemperature=temp;
	
	}
	public int  getAverageTemperature() {
		 return averageTemperature;
	}
	
	
}
