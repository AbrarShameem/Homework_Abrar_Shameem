package homework2.encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		Student s  = new Student();
		
		s.setName("Abrar");
		s.setAge(22);
		
		System.out.println(s.getName());
		System.out.println(s.getAge());

	}

}
