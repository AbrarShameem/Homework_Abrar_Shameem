package homework2;

interface DogActions {
	void Bark();
	void Poop();
}
interface DogCharacteristics {
	void SmallNose();
	void BigEars();
}

abstract class Dog {
	String breed;
	public void Bark () {
		System.out.println("Bark!");
	}
	
	public abstract void Poop ();
}

class Chihuahua extends Dog{
	public void Poop() {
		System.out.println("Dog pooped!");
	}
}
public class abstraction {

	public static void main(String[] args) {
		Chihuahua c = new Chihuahua();
		c.Bark();
		c.Poop();
	}

}
