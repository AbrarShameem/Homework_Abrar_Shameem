package homework1;

public class Function0 {
//hw
	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "hello";
		String string3 = string1.toUpperCase();
		String string4 = string2.toUpperCase();
		int i = string3.compareTo(string4);
		if(i==0){
			System.out.println("Both strings are equal.");
			}else{
			System.out.print("Strings are not equal.");
			}

	}

}
