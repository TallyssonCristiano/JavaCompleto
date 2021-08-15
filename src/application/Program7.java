package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account7;


public class Program7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double deposit, withdraw, balance; 
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();	
		System.out.print("Is there na initial deposit (y/n)? ");
		char x = sc.next().charAt(0);
		
		if (x == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			System.out.println();
			balance = deposit;
		}
		else {
			balance = 0;
		}
		
		Account7 acc = new Account7(number, name, balance);
		
		System.out.println("Account data: ");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		acc.deposit(deposit);
		System.out.println();
		
		System.out.println("Updated account data: "); 
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		withdraw = sc.nextDouble();
		acc.withDraw(withdraw);
		System.out.println();
		
		System.out.println("Updated account data: "); 
		System.out.println(acc);
			
		sc.close();
	}

}
