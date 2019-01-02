package chapter02;

public class Student extends Person {
	public Student() {
		super();
		// 자식 생성자에서 부모 생성자를 지정하지 않으면
		// 기본적으로 부모의 기본 생성자가 (먼저) 호출된다.
		System.out.println("Student() called");
		// super();뒤에 호출하면 오류 이 경우는 자식을 먼저 호출
	}
}
