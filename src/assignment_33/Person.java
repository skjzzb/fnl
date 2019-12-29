package assignment_33;

public class Person {
	int age;
	String name;
	public Person(String nm ) {
		
		this(18);
		this.name = nm;
	}
	public Person(int age) {
		
		this.age = age;
	}
	public Person(int age, String name) {
	
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Person pp=new Person(21,"XYZ");
		Person p=new Person("XYZ");
		System.out.println(p);
		System.out.println(pp);
	}

}
