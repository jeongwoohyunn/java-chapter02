package chapter02;

public class Customer {  
	public String name;//같은 패키지내 가능 + 자식에서 접근
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
