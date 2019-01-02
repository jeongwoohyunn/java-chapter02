package com.duzone.paint.main;

import com.duzone.paint.i.Drawable;
import com.duzone.paint.point.ColorPoint;
import com.duzone.paint.point.Point;
import com.duzone.paint.shape.Circle;
import com.duzone.paint.shape.Rect;
import com.duzone.paint.shape.Shape;
import com.duzone.paint.shape.Triangle;
import com.duzone.paint.text.GraphicString;

public class MainApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		// drawPoint(p1);
		// drawPoint(p1);
		p1.show();

		Point p2 = new Point(50, 50);// 생성자 오버로딩
		p2.show();
		p2.show(false);
		// drawPoint(p2);
		draw(p2);

		// ColorPoint p3= new ColorPoint();
		Point p3 = new ColorPoint();
		p3.setX(100);
		p3.setY(50);
		// (ColorPoint)p3.setColor("red");//캐스팅
		((ColorPoint) p3).setColor("red");// 캐스팅
		// p3.show(true);//Point에서 boolean에서 show자체를 불러와서 -재사용-
		// p3.show(false);
		draw(p3);

		Point p4 = new ColorPoint(200, 100, "yello");
		draw(p4);

		Shape triangle = new Triangle();
		triangle.setLineColor("black");
		// down casting ->명시적(Exlicity)
		// Triangle t1 = (Triangle)triangle;
		// t1을 한번만쓴다면 굳이 변수만들 필요가없다.
		((Triangle) triangle).setX1(10);// 우선순위 괄호해줘야된다.
		// Shape s = triangle;
		// draw(s);
		draw(triangle);
		// 큰메소드에서 작은 메소드로 갈때

		Shape rect = new Rect();
		// drawrect(rect);
		// up casting -> 암시적(Implicity)그냥 써도된다.
		Shape r1 = rect;
		draw(r1);

		// Shape circle = new Circle();
		Drawable circle = new Circle();
		// draw(new Circle());
		// drawcircle(circle);
		draw(circle);

		draw(new GraphicString("Hello"));

		// 연산자 instanceof
		Shape s = new Circle();
		System.out.println(s instanceof Shape);// ==
		System.out.println(s instanceof Circle);// ==
		System.out.println(s instanceof Rect);// ==
		System.out.println(s instanceof Drawable);// ==

		Circle c = (Circle) s;
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Object);
		// 에러 : 계층 관계가 아닌 경우에는 연산을 할 수 없음;
		// System.out.println(c instanceof Rect);

	}

//	public static void drawPoint(Point point) {
//		point.show();
//	}
//	public static void draw(Shape shape) {
//		shape.draw();
//	} 위에 두개를 하나로 인터페이스
	public static void draw(Drawable drawable) {
		drawable.draw();
	}

//	public static void drawtriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	public static void drawrect(Rect rect) {
//		rect.draw();
//	}
//	public static void drawcircle(Circle circle) {
//		circle.draw();
//		//구현을 하고 test case test
//		//커버리지 test가 있냐? 없으면 유지보수가힘들다.
//		
//	}
}
