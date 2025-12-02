package Assignment3;

class BankAccount {

    protected String accountNo;
    protected double balance;

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

class SalaryAccount extends BankAccount {

    private double monthlySalary;

    public SalaryAccount(String accountNo, double balance, double monthlySalary) {
        super(accountNo, balance);
        this.monthlySalary = monthlySalary;
    }

    public void creditSalary() {
        balance += monthlySalary;
        System.out.println("Salary credited: " + monthlySalary);
    }
}


public class Bank {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("SA1001", 5000, 5);
        sa.deposit(2000);
        sa.addInterest();
        sa.withdraw(3000);
        sa.displayBalance();

        System.out.println();

        SalaryAccount sal = new SalaryAccount("SAL2001", 10000, 25000);
        sal.creditSalary();
        sal.withdraw(5000);
        sal.displayBalance();

	}

}
