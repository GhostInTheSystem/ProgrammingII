class Food {
	private double calories;
	private boolean isTasty;
	private double servingSize;
	private String name;
	private String measurement;
	
	public Food(){
		
	}
	
	public Food(double calories, boolean isTasty, double servingSize, String measurement, String name){
		this.calories = calories;
		this.isTasty = isTasty;
		this.servingSize = servingSize;
		this.measurement = measurement;
		this.name = name;
	}
	
	public void setCalorieCount(int calories){
		this.calories = calories;
	}
	
	public void setIsTasty(boolean isTasty){
		this.isTasty = isTasty;
	}
	
	public void setServingSize(double servingSize, String tempMeasurement){
		this.servingSize = servingSize;
		this.measurement = measurement;
	}
	
	public void setName(String name){
		this.name = name;
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
