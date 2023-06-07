import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {
	
	private final Account account = new Account();
	
	@Test
    void shouldAddAmountToBalance() {      
        account.deposit(Double.parseDouble("100.0"));
        assertThat(Double.parseDouble("100.0"))
                .isEqualTo(account.getBalance());
    }

    @Test
    void shouldRemoveAmountToBalanceWhenAmountIsLessBalance() throws NumberFormatException, Exception {    	
    	account.deposit(Double.parseDouble("100.0"));
        account.withdraw(Double.parseDouble("20.0"));
        assertThat(Double.parseDouble("80.0"))
        .isEqualTo(account.getBalance());
    }
    
    @Test
    void shouldPrintTran() throws NumberFormatException, Exception {        
        account.deposit(Double.parseDouble("100.0"));
        account.withdraw(Double.parseDouble("20.0"));
        account.withdraw(Double.parseDouble("20.0"));
        account.withdraw(Double.parseDouble("20.0"));
        account.deposit(Double.parseDouble("10.0"));
        assertThat("Date | Amount | Balance\n"
        		+ "2023-06-07 | 100.0 | 100.0\n"
        		+ "2023-06-07 | 20.0 | 80.0\n"
        		+ "2023-06-07 | 20.0 | 60.0\n"
        		+ "2023-06-07 | 20.0 | 40.0\n"
        		+ "2023-06-07 | 10.0 | 50.0\n"
        		+ "")
                .isEqualTo(account.printStatement());
    }
    
}