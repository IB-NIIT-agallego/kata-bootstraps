import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
	
	private double balance;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
			
    public void deposit(double amount) {    	
        balance += amount;     
        transactions.add(new Transaction(LocalDate.now(), amount, balance));
    }	
	
	public void withdraw(double amount) {
        if (balance >= amount) {           
        	balance -= amount;
        	transactions.add(new Transaction(LocalDate.now(), amount, balance));
        } else {
            System.out.println("Insufficient balance");
        }
    }	
	
	public void printStatement() {
		System.out.println("Date" + "--" + "Amount" + "--" + "Balance");
		for (Transaction transaction : transactions) {
			System.out.println(transaction.getDate() + "--" + transaction.getAmount() + "--" + transaction.getBalance());
		}
	}
}
