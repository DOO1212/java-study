package sec01.exam01_2;

import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj instanceof Student) return false;
		
		Student other = (Student) obj;
		return age == other.age && name.equals(other.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	
	
	
	
	
	
	
	
	

}
