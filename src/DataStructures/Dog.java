package DataStructures;

public class Dog {

	private int age;
	private String name;
	
	public Dog(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;
	}

	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		
		if (o instanceof Dog) {
			Dog d = (Dog) o;
			if(this.age == d.age &&	 this.name.equals(d.name)) return true;
		}
		return false;
	}
	
	
}
