package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee.toString());
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double x = sc.nextDouble();
		
		employee.increaseSalary(x);
		
		System.out.println();
		System.out.println("Updated data: " + employee.toString());
		
		
		
		sc.close();
	}

}
