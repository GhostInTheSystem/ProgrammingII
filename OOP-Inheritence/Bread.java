class Bread extends Food{
	private boolean isProcessed;
	private boolean isFancyBread;
	private String countryOfOrigin;
	private boolean isToasted;
	
	public Bread(boolean isProcessed, boolean isFancyBread, String countryOfOrigin, boolean isToasted){
		this.isProcessed = isProcessed;
		this.isFancyBread = isFancyBread;
		this.countryOfOrigin = countryOfOrigin;
		this.isToasted = isToasted;
	}
	public Bread(){
		
	}
	public void setIsProcessed(boolean isProcessed){
		this.isProcessed = isProcessed;
	}
	public void setIsFancyBread(boolean isFancyBread){
		this.isFancyBread = isFancyBread;
	}
	public void countryOfOrigin(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}
	public void setIsToasted(boolean isToasted){
		this.isToasted = isToasted;
	}
	public boolean getIsProcessed(){
		return isProcessed;
	}
	public boolean getIsFancyBread(){
		return isFancyBread;
	}
	public String getCountryOfOrigin(){
		return countryOfOrigin;
	}
	public boolean getisToasted(){
		return isToasted;
	}
}
