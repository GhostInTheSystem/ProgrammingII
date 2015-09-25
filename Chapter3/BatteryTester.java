public class BatteryTester{
	public static void main(String[] args) {
		Battery b1 = new Battery(3000);

		b1.drain(1000);

		System.out.println("The current capacity is: " + b1.getRemainingCapacity());

		b1.charge();

		System.out.println("The current capacity is now: " + b1.getRemainingCapacity());

	}
}
