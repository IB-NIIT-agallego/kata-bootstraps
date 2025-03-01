import java.time.LocalDate;

public class Transaction {
	
	private LocalDate date;
	private double amount;
	private double balance;		
	
	public Transaction(LocalDate date, double amount, double balance) {	    
	    this.date = date;
	    this.amount = amount;
	    this.balance = balance;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
