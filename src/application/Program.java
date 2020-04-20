package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.Color;
import entitites.Circle;
import entitites.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Rectangle> rectList = new ArrayList<Rectangle>();
		List<Circle> circList = new ArrayList<Circle>();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int number = input.nextInt();
		for (int control = 1; control <= number; control++) {
			System.out.println("Shape #" + control + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			input.nextLine();
			char decision = input.nextLine().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(input.nextLine());
			if (decision == 'r') {
				System.out.print("Width: ");
				double width = input.nextDouble();
				System.out.print("Height: ");
				double height = input.nextDouble();
				rectList.add(new Rectangle(color, width, height));
			}
			else if (decision == 'c') {
				System.out.print("Radius: ");
				double radius = input.nextDouble();
				circList.add(new Circle(color, radius));
			}
			else System.out.println("It was not selected rectangle nor cicle correctly!");
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Rectangle obj : rectList) {
			System.out.println(String.format("%.2f", obj.area()));
		}
		for (Circle obj : circList) {
			System.out.println(String.format("%.2f", obj.area()));
		}
		
		input.close();
	}

}
