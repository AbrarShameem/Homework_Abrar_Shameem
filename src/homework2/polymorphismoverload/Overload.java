package homework2.polymorphismoverload;

public class Overload {

	
	public void cars(String drive, String gas) {
		String normalCar = drive + gas;
		System.out.println("this is what normal cars do");
		
	}
	public void cars(String drive, String gas, String brake) {
		String normalCar = drive + gas + brake;
		System.out.println("this is what normal cars do");
		
	}
	public void bikes(String ride, String pedal) {
		String normalCar = ride + pedal;
		System.out.println("this is what normal bikes have");
		
	}
	public void bikes(String ride, String pedal, String chain) {
		String normalCar = ride + pedal + chain;
		System.out.println("this is what normal bikes have");
		
	}
	
}
