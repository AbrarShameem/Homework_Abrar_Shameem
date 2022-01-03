package polymorphismoverride;

public class OverrideMain {

	public static void main(String[] args) {
		Override ovr1 = new Override();
		ovr1.computer(1, 3);
		ovr1.computer(4, 2, 6);
		
		System.out.println("these parts complete a computer");
	}

}
