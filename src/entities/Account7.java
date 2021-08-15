package entities;

public class Account7 {
	
	private int number;
	private String name;
	private double balance;
	
	public Account7(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withDraw(double withdraw) {
		balance = balance - withdraw - 5;
	}

	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ name +
				", Balance: $ " 
				+ String.format("%.2f", balance);
	}

}
