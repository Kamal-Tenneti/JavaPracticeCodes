package AbstractClassesandInterfaces;

interface IABCBank{
	void openAccount();
	void closeAccount();
}

interface IBankAccount{
	void deposite();
	void withdraw();
	void balance();
}
class Saving implements IBankAccount, IABCBank{

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("OpenAccount in SA");
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("CloseAccount in SA");
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Deposite in SA");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw in SA");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("balance in SA");
	}
	
}
public class InterfaceExample {
	public static void main(String[] args) {
		Saving saving = new Saving();
		saving.openAccount();
		saving.deposite();
		saving.withdraw();
		saving.balance();
		saving.closeAccount();
		
	}
}
