package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.a = sc.nextDouble();
		student.b = sc.nextDouble();
		student.c = sc.nextDouble();
		
		double nota = student.nota();
		System.out.printf("FINAL GRADE = %.2f%n", nota);
		
		if (nota >= 60) {
			System.out.println("PASS");
		}
		else {
			double x = 60 - nota;
			System.out.println("FAILED");
			System.out.printf("Missing %.2f Points%n", x);
		}
		
		sc.close();
	}

}
