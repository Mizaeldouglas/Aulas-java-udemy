package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {

		List<Shape> myShape = new ArrayList<>();
		myShape.add(new Rectangle(3.0,2.0));
		myShape.add(new Circle(2.0));

		List<Circle> myCicle = new ArrayList<>();
		myCicle.add(new Circle(2.0));
		myCicle.add(new Circle(3.0));

		System.out.println("Total ara: " + totalArea(myCicle));

	}
	public static double totalArea(List<? extends Shape> list){
		double sum = 0.0;
		for (Shape s :
				list) {
			sum += s.area();
		}
		return sum;
	}
}
