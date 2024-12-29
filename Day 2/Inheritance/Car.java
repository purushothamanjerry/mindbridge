package day2;

public class Car {

	private String brand;
    private String model;
    private int price;
    private int dispercen;

	
	public Car(String brand, String model, int price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		
	}
	public void details() {
		System.out.println("Car Deatails");
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("price:"+price);
	}
	public int discount(int dispercen) {
		int discount=(price*dispercen)/100;
		return discount;
	}
	
	public static void main(String[] args) {
		
		Car car=new Car("BMW","e340i",430000000);
		
		car.details();
		int dispercentage=20;
		int discountvalue=car.discount(dispercentage);
		System.out.println("Discount price :"+discountvalue);
		
	}
	

}
