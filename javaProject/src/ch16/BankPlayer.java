package ch16;

public class BankPlayer extends Thread{
	int user;
	MyBank mybank;
	
	public BankPlayer(int user,MyBank mybank) {
		this.user =user;
		this.mybank= mybank;
	}
	
	@Override
	public void run() {
			switch (user) {
			case 1:mybank.bankUserA(); break;
			case 2:mybank.bankUserB(); break;
			case 3:mybank.bankUserC(); break;
			}
	}
	
	
	}

