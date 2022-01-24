package homework1;

public class Function6 {

	public static void main(String[] args) {
		String str1= "Let's see how this goes!";
		System.out.println("The length of the string: "+ str1.length());
		System.out.println("Actual String: "+str1);
		System.out.print("String reverse: ");
		for(int i = str1.length()-1; i>=0; i--){
		System.out.print(str1.charAt(i));
		}

	}

}
