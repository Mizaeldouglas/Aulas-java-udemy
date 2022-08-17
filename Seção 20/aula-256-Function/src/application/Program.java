package application;

import entites.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));


		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); //Implementação da interface

		list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); // Reference method com método estático

		list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); // Reference method com método não estático

		Function<Product, String> func = product -> product.getName().toUpperCase();
		list.stream().map(func).collect(Collectors.toList()); // Expressão lambda declarada


		list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList()); // Expressão lambda inline



		names.forEach(System.out::println);


	}
}
