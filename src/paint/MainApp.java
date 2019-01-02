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
		
		Triangle triangle = new Triangle();
		drawtriangle(triangle);
		
		Rect rect = new Rect();
		drawrect(rect);
	}
	public static void drawPoint(Point point) {
		point.show();
	}
	public static void drawtriangle(Triangle triangle) {
		triangle.draw();
	}
	public static void drawrect(Rect rect) {
		rect.draw();
	}
}
