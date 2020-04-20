package entitites;

import entities.enums.Color;

public class Circle extends Shape{
	
	private static final Double PI = 3.14;
	private Double radius;
	
	public Circle(Color color) {
		super(color);
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
		
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return PI * Math.pow(radius, 2);
	}

}
