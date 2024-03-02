package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelDemo {

	@Value("#{2+3}")
	private int x;

	@Value("#{22*65}")
	private int y;

	@Value("#{ new java.lang.String('harsh') }")
	private String name;
	
	@Value("#{ T(java.lang.Math).sqrt(256) }")
	private int finalAnswer;
	
	@Value("#{ T(java.lang.Math).E }")
	private float eVal;
	
	@Value("#{ 8-3>2 }")
	private boolean expression;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFinalAnswer() {
		return finalAnswer;
	}
	public void setFinalAnswer(int finalAnswer) {
		this.finalAnswer = finalAnswer;
	}
	public float geteVal() {
		return eVal;
	}
	public void seteVal(float eVal) {
		this.eVal = eVal;
	}
	public boolean isExpression() {
		return expression;
	}
	public void setExpression(boolean expression) {
		this.expression = expression;
	}
	@Override
	public String toString() {
		return "SpelDemo [x=" + x + ", y=" + y + ", name=" + name + ", finalAnswer=" + finalAnswer + ", eVal=" + eVal
				+ ", expression=" + expression + "]";
	}
	
	
}
