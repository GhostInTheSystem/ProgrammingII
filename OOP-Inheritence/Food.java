class Food {
	private double calories;
	private boolean isTasty;
	private double servingSize;
	private String name;
	private String measurement;
	
	public void setCalorieCount(int a){
		calories = a;
	}
	
	public void setIsTasty(boolean a){
		isTasty = a;
	}
	
	public void setServingSize(double a, String tempMeasurement){
		servingSize = a;
		measurement = tempMeasurement;
	}
	
	public void setName(String tempName){
		name = tempName;
	}
	
	public double getCalorie(){
		return calories;
	}
	
	public boolean isTasty(){
		return isTasty;
	}
	
	public String getSerivingSize(){
		return  Double.toString(servingSize) + measurement;
	}
	
	public String getName(){
		return name;
	}
}
