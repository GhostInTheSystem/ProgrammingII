class Cake extends Food{
	private String flavor;
	private double sugarCount;
	private String frosting;
	private double cookTime;
	
	public Cake(String flavor, double sugarCount, String frosting, double cookTime){
		this.flavor = flavor;
		this.sugarCount = sugarCount;
		this.frosting = frosting;
		this.cookTime = cookTime;
	}
	public Cake(){
		
	}
	public void setFlavor(String flavor){
		this.flavor = flavor;
	}
	public void setSugarCount(double sugarCount){
		this.sugarCount = sugarCount;
	}
	public void setFrosting(String frosting){
		this.frosting = frosting;
	}
	public void setCookTime(double cookTime){
		this.cookTime = cookTime;
	}
	
	public String getFlavor(){
		return flavor;
	}
	public double getSugarCount(){
		return sugarCount;
	}
	public String getFrosting(){
		return frosting;
	}
	public double getCookTime(){
		return cookTime;
	}
}
