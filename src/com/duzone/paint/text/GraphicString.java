package com.duzone.paint.text;

import com.duzone.paint.i.Drawable;

public class GraphicString implements Drawable {
	private String text = "";
	public GraphicString(String text) {
		this.draw();
	}
	@Override
	public void draw() {
		System.out.println("텍스트("+text+") 를 그렸습니다.");
	}
}
