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


		// exemplo 2

		//Princípio get/put - covariância

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
		//list.add(20); // erro de compilacao

		// Princípio get/put - contravariância

		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		//Number x = myNums.get(0); // erro de compilacao




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
