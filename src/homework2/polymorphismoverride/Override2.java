package homework2.polymorphismoverride;

public class Override2 extends Override {

	
	public void computer(int a, int b) {
		int components = a + b;
		System.out.println("these two put together are parts of a computer");
		
	}
	public void computer(int a, int b, int c) {
		int components = a + b + c;
		System.out.println("these are updated parts of a computer");
		
	}
	
}
