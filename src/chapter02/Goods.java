package chapter02;
public class Goods { 
	//데이터 getset
	//모든 클래스는 object를 부모로 한다 생성전에는
	//정보은닉을 위해 private를 쓰고 메소드를 활용해라
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public static int countOfGoods;
	
	public Goods() {
		//생성자
		countOfGoods++;
		//Goods.countOfGoods++;
		//원래는 이게 맞지만 생략 가능
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0) {
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public void showInfo() {
		System.out.println("상품이름 : "+ name);
		System.out.println("가격 : "+ price);
		System.out.println("재고량 : "+ countStock);
		System.out.println("판매량 : "+ countSold);
	}
	public int calcDiscountPrice(float discountRate) {
		return price - (int)(price * discountRate);
		//
	}
}
