
public class Location {
	private int algaelevel;
	private int ammountofwater;
	private int locationnumber;
	private boolean hasresearchstation;
	private boolean haswaterpurification;
	private String phosphorousconcentration;
	
	public Location(int templocationnumber){
		algaelevel = 0;
		ammountofwater = 0;
		hasresearchstation = false;
		haswaterpurification = false;
		locationnumber = templocationnumber;
		phosphorousconcentration = "unknown";
	}
	
	public void setAlgaeLevel(int level){
		algaelevel = level;
	}
	
	public void addWater(int water){
		ammountofwater += water;
	}
	
	public void removeWater(int water){
		ammountofwater -= water;
	}
	
	public void addResearchStation(){
		hasresearchstation = true;
	}
	
	public void addWaterPurification(){
		haswaterpurification = true;
	}
	
	public void setPhosphorous(int i){
		if(i == 0){
			phosphorousconcentration = "none";
		}
		else if(i == 1 || i == 2){
			phosphorousconcentration = "low";
		}
		else if(i == 3 || i == 4){
			phosphorousconcentration = "medium";
		}
		else if(i == 5 || i == 6){
			phosphorousconcentration = "high";
		}
	}
	
	public int getAlgaeLevel(){
		return algaelevel;
	}
	
	public int getAmmountOfWater(){
		return ammountofwater;
	}
	
	public int getLocationNumber(){
		return locationnumber;
	}
	
	public boolean hasResearchStation(){
		return hasresearchstation;
	}
	
	public boolean hasWaterPurification(){
		return haswaterpurification;
	}
	
	public String hasResearchStationString(){
		if (hasresearchstation){
			return "yes";
		}
		else{
			return "no";
		}
	}
	
	public String hasWaterPurificationString(){
		if (haswaterpurification){
			return "yes";
		}
		else{
			return "no";
		}
	}
	
	public String phosphorousConcentration(){
		return phosphorousconcentration;
	}
	
}