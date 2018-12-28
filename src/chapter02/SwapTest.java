package chapter02;

public class SwapTest {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a+" : "+b);
		
		//call by value
		//swap
//		int temp=a;
//		a=b;
//		b=temp;
		swap(a,b);
		System.out.println(a+" : "+b);
		
		
		
		//callby reference
		Value m =new Value();
		
		m.value=10;
		//value 형식
		Value n = new Value();
		n.value=20;
		
		System.out.println(m.value+" : "+n.value);
		swap(m,n);
		System.out.println(m.value+" : "+n.value);		
	}
	//스태틱안에 있는걸 부르므로 static적어줘야된다.
	public static void swap(int i,int j) {
		int temp = i;
		i=j;
		j=temp;
		//안바뀌는 이유 전부 stack에 들어가있는 상태에서 끝난다.
	}
	
	public static void swap(Value i,Value j) {
		//오버 로딩(인수가 다르다) 다형성
		//같은 함수를(메소드를) 써서 메시지를 보낸다.
		
		int temp = i.value;
		i.value = j.value;
		j.value = temp;
		
		//Integer 객체는 불변객체다.
		Integer i2 = new Integer(10);
		//Integer i2 = 10; 위에거와 같다.
		int j2 =i2.intValue();//원래형식
		//int j2 = i2;
	}
}
