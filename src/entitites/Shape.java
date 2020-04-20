package entitites;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public abstract Double area();
	
}
