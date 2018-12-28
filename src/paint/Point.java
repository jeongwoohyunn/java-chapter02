package paint;

public class Point {
	private int x;
	private int y;
	public Point() {
		
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void show() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
	public void show(boolean visible) {
		if(visible)//visible ==true 필요없는 코드
			//System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
			
			show();
		//중복성을 피하고 수정을 여러번 할 필요가 없다. = 리팩토링(기능은 그대론데 가치를 높인다.)
		else {
		}
			System.out.println("점[x="+x+", y="+y+"]을 지웠습니다.");
	}
	/*
	 * public void disapear() {
	 * 	메소드를 여러개 쓰지말고 show에서
	 * }
	 */
	
	//여러 메소드를 쓰는것보다 하나의 메소드로 컨트롤할수있다.
}
