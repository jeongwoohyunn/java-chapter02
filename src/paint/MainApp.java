package paint;

public class MainApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		drawPoint(p1);
		p1.show();
		
		Point p2 = new Point(50,50);//생성자 오버로딩
		p2.show();
		p2.show(false);
		drawPoint(p2);
		
		
		//ColorPoint p3= new ColorPoint();
		Point p3= new ColorPoint();
		p3.setX(100);
		p3.setY(50);
		//(ColorPoint)p3.setColor("red");//캐스팅
		((ColorPoint)p3).setColor("red");//캐스팅
		//p3.show(true);//Point에서 boolean에서 show자체를 불러와서 -재사용-
		//p3.show(false);
		drawPoint(p3);
		
		Shape triangle = new Triangle();
		//Shape s = triangle;
		//draw(s);
		draw(triangle);
		
		Shape rect = new Rect();
		//drawrect(rect);
		draw(rect);
		Shape circle = new Circle();
		//drawcircle(circle);
		draw(circle);
	}
	public static void drawPoint(Point point) {
		point.show();
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
	public static void draw(Shape shape) {
		shape.show();
	}
}
