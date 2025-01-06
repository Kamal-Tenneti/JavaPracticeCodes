package AbstractClassesandInterfaces;

abstract class ABCBank{
	public static void message() {
		System.out.println("Welcome to ABCBank");
	}
	abstract void openAccount();
	abstract void closeAccount();
}
abstract class BankAccount extends ABCBank{
	abstract void deposite();
	abstract void withdraw();
	abstract void balance();
}

class SavingAccount extends BankAccount{

	@Override
	void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open Account");
		
	}

	@Override
	void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close Account");
		
	}

	@Override
	void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Deposite in SA");		
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw from SA");
		
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in SA");
		
	}
	
}

class CurrentAccount extends BankAccount{
	@Override
	void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open Account");
		
	}

	@Override
	void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close Account");
		
	}
	
	@Override
	void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Deposite in CA");		
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw from CA");
		
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in CA");
		
	}
	
}

public class AbstractClassandMethods {
	public static void main(String[]args) {
		
		ABCBank.message();
		
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.openAccount();
		savingAccount.deposite();
		savingAccount.withdraw();
		savingAccount.balance();
		savingAccount.closeAccount();
		
		System.out.println("--------------------");
		
 		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.openAccount();
		currentAccount.deposite();
		currentAccount.withdraw();
		currentAccount.balance();
		currentAccount.closeAccount();
		
		
	}

}
