package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and heigth: ");
		rectangle.width = sc.nextDouble();
		rectangle.heigth = sc.nextDouble();
		
		double area = rectangle.area();
		System.out.printf("Area = %.2f%n", area);
		
		double perimeter = rectangle.perimeter();
		System.out.printf("Perimeter = %.2f%n", perimeter);
		
		double diagonal = rectangle.diagonal();
		System.out.printf("Diagonal = %.2f%n", diagonal);
		
		sc.close();
	}

}
