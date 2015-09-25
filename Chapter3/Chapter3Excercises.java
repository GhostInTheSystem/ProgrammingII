class Chapter3Excercises{

	/** 
	R3.16
	*/

	/*
	Counter c1 = new Counter();
	c1.reset();
	System.out.println(c1.getValue());
	c1.click();
	System.out.println(c1.getValue());
	*/

	/**
	R3.17
	*/

	/*
	Car myCar = new Car(25);
	myCar.addGas(20);
	myCar.drive(50);
	myCar.addGas(2);
	double gasLeft = myCar.getGasInTank();

	//expected
	System.out.println("20 gallons");
	//actual
	System.out.println(gasLeft);
	*/

	/**
	R3.22
	*/

	/*
	Rectangle class
	Car class 
	*/

	/**
	R3.24
	*/
	/*
	Create multiple constriuctors for the car class so that 
	different kinds of cars can be created. possibly even
	create a multiple classes that inherit from the Car class
	to allow the programmer to create a very specific type of 
	car i.e. sports car, van, truck, etc.
	*/

	/**
	E3.3
	*/
	/*
	BankAccount b1 = new BankAccount();
	BankAccount b2 = new BankAccount(25);

	b1.deposit(1000);
	b1.withdraw(500);
	b1.withdraw(400);

	System.out.println("b1 value is: " + b1.getBalance());
	System.out.println("b2 value is: " + b2.getBalance());
	*/

	/**
	E3.4
	*/
	/*
	public void addInterest(double rate){
		double interestRate = rate * .01;
		balance = balance + (balance * interestRate);

	}

	public class BankAccountTester{
		public static void main(String[] args) {
			BankAccount b1 = new BankAccount(1000);
			b1.addInterest(10);
			//actual
			System.out.println("b1 value is: " + b1.getBalance());
			//suspected
			System.out.println("expected b1 value is: 1100");
		}
	}
	*/

	/**
	E3.5
	*/

	/*
	public class SavingsAccount{

		private double balance;
		private double interest;

		public SavingsAccount(){

			balance = 0;
			interest = 0;

		}

		public void SavingsAccount(double tempBal, double tempInt){

			balance = tempBal;
			interest = tempInt * .01;

			balance = balance + (balance * interest);

		}

		public void addInterest(double tempInt){

			interest = tempInt * .01;
			balance = balance + (balance * interest);
		}

		public double getBalance(){
			return balance;
		}

	}

	public class SaavingsAccountTester{
		public static void main(String[] args) {
			SavingsAccount s1 = new SavingsAccount(1000, 10);

			s1.addInterest(10);

			//actual
			System.out.println(s1.getBalance());
			//Expected
			System.out.println("expected vaule is 1210");
		}
	}
	*/

	/**
	E3.6
	*/
	/*
	public void printReceipt{

		System.out.println("total amount due: " + purchase);

	}
	*/

	/**
	E3.7
	*/

	/*
	private double taxRate;
   	private double purchase;
   	private double taxablePurchase;
   	private double payment;
   	private double saleCount;
   	private double saleTotal;

	public void setSalesCount(){
      saleCount += 1;
   	}

   	public void setSalesTotal(double tempAmount){
      saleTotal += tempAmount;
   	}

   	public void recordPurchase(double amount){
      purchase = purchase + amount;
      setSalesCount();
      setSalesTotal(amount);
   	}

   	public double getSalesCount(){
   		return saleCount;
   	}

   	public double getSalesTotal(){
   		return saleTotal;
   	}

   	public void reset(){
   		saleCount = 0;
   		saleTotal = 0;
   	}
	*/

	/**
	E3.8
	*/

	/*
	public class Employee{

		private String name;
		private double salary;
		private double raiseRate;

		public Employee(String tempName, double tempSalary){
			name = tempName;
			salary = tempSalary;
		}

		public String getName(){
			return name;
		}

		public double getSalary(){
			return salary;
		}

		public void raiseSalary(double tempRaise){
			raiseRate = tempRaise * .01;
			salary = salary + (salary * raiseRate);
		}

	}

	public class EmployeeTest{
		public void main(String[] args) {
			Employee e1 = new Employee("berny", 500);

			System.out.println("the employee's name is: " + e1.getName);

			e1.raiseSalary(25);

			System.out.println("the employee's salary is: " + e1.getSalary);

		}
	}
	*/

	/**
	E3.12
	*/

	/*
	public class Bug{

		private int position;
		private int direction;

		public Bug(int initialPosition){
			position = initialPosition;
			direction = 1;
		}

		public void turn(){
			direction = -1;
		}

		public void move(){
			position += direction;
		}

		public int getPosition(){
			return position;
		}

	}

	public class BugTester{
		public static void main(String[] args) {
			Bug b1 = new Bug(10);

			b1.move(); //11
			b1.move(); //12
			b1.move(); //13

			b1.turn(); //moving left

			b1.move(); //12
			b1.move(); //11

			//actual
			System.out.println("The bug's position is: " + b1.getPosition);
			//expected
			System.out.println("The bugs expected positon is 11");

		}
	}
	*/

}
