public class Battery{

	private double capacity;
	private double originalCapacity;

	public Battery(double capacity){
		this.capacity = capacity;
		originalCapacity = this.capacity;
	}

	public void drain(double amount){
		capacity -= amount;
	}

	public void charge(){
		capacity = originalCapacity;
	}

	public double getRemainingCapacity(){
		return capacity;
	}
} 
