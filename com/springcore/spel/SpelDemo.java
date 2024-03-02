package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelDemo {

	@Value("#{2+3}")
	private int x;
	@Value("#{22*65}")
	private int y;
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
	
	@Override
	public String toString() {
		return "SpelDemo [x=" + x + ", y=" + y + "]";
	}
}
