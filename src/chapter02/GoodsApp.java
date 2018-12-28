package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();//블락안에서 만든것은 지역변수
		//goods.name = "hello"; private라 쓸 수 없다.
		//데이터는 메소드로 접근  디버깅하기쉽다.
		goods.setName("nikon"); 
		goods.setPrice(-1);
		//메소드는 로직이 들어갈수있다.
		goods.setCountSold(100);
		goods.setCountStock(50);
		//메소드로 초기화한것
		System.out.println(
				goods.getName() + ":"+
				goods.getPrice() + ":"+
				goods.getCountStock()+ ":"+
				goods.getCountSold());
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		System.out.println(Goods.countOfGoods);//앞에 클래스이름 붙여줘야된다.
	}
}
