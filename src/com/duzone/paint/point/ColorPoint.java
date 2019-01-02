package com.duzone.paint.point;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		//기본 생성자
	}
	public ColorPoint(int x,int y,String color) {
		super(x,y);//setX setY보다 깔끔한 코드
		//자식 클래스에서 부모껄 쓸때, 사용하면 따로 생성자콜하지않는다.
		//this.x = x;
		//private라 오류
		setX(x);
		setY(y);
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("점[x="+getX()+", y="+getY()+", color = "+color+"]을 그렸습니다.");
	}
	
	
}
