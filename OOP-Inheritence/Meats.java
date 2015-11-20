class Meats extends Food {
	
	private double protein;
	private String sourceAnimal;
	private String redness;
	private final int RARE = 1;
	private final int MEDIUM_RARE = 2;
	private final int MEDIUM = 3;
	private final int MEDIUM_WELL = 4;
	private final int WELL_DONE = 5;
	private final int NOT_RED = 0; 
	
	public void setProtein(double protein){
		this.protein = protein;
	}
	
	public void setSourceAnimal(String sourceAnimal){
		this.sourceAnimal = sourceAnimal;
	}
	
	public void setRedness(int rareness){
		if(rareness == RARE){
			redness = "Rare";
		} else if(rareness == MEDIUM_RARE){
			redness = "Medium Rare";
		} else if(rareness == MEDIUM){
			redness = "Medium";
		} else if(rareness == MEDIUM_WELL){
			redness = "Medium Well";
		} else if(rareness == WELL_DONE){
			redness = "Well Done";
		} else if(rareness == NOT_RED){
			redness = "Not a Red Meat";
		}
	}
	
	public double getProtein(){
		return protein;
	}
	
	public String getSourceAnimal(){
		return sourceAnimal;
	}
	
	
}
