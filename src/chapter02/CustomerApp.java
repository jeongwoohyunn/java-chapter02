package chapter02;
//전역 변수, 전역 함수는 없다.
/*int i=10;
void test() {
	
}*/
public class CustomerApp {  

	public static void main(String[] args) {
		Customer c = new Customer();
		
		//protected는 같은 패키지에서 접근 가능.
		c.name = "둘리";//접근 가능 default
		
		//private는 외부에서 접근 불가.
		//c.age = 10
		c.setAge(10);
	}

}
