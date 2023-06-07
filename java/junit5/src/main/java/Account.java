import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
	
	private double balance;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	    
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {    	
        balance += amount;     
        transactions.add(new Transaction(LocalDate.now(), amount, balance));
    }	
	
	public void withdraw(double amount) throws Exception {
        if (balance >= amount) {           
        	balance -= amount;
        	transactions.add(new Transaction(LocalDate.now(), amount, balance));
        } else {
            throw new Exception("Insufficient balance");
        }
    }	
	
	public String printStatement() {
		StringBuilder stringBuilder = new StringBuilder("Date | Amount | Balance").append("\n");		
		for (Transaction transaction : transactions) {
			stringBuilder.append(transaction.getDate() + " | " + transaction.getAmount() + " | " + transaction.getBalance()).append("\n");
		}		
		return stringBuilder.toString();
	}
}
