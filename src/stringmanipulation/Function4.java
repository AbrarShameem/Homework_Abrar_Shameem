package stringmanipulation;

public class Function4 {

	public static void main(String[] args) {
		
			String string1 = "Hello";
			String string2 = "hello";
			String string3 = string1.toLowerCase();
			String string4 = string2.toLowerCase();
			int i = string3.compareTo(string4);
			if(i==0){
				System.out.println("Both strings are equal.");
				}else{
				System.out.print("Strings are not equal.");
				}
	}

}
