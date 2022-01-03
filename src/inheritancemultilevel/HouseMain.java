package inheritancemultilevel;

public class HouseMain {

	public static void main(String[] args) {
		House2 h2 = new House2();
		House3 h3 = new House3();
		
		h2.bathroom();
		h2.bedroom();
		h2.kitchen();
		h2.terrace();
		
		h3.bathroom();
		h3.terrace();
		
		
	}

}
