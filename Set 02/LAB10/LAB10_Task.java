
public class LAB10_Task {
	public static Plant[] plants = new Plant[5];
	public static int plantcount = -1;
	public static int findPlant = -1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(new Plant("Almond","Brown"));
		add(new Herb("Tulsi","Green","All",true));
		add(new Flower("Rose","Red",true,true));
		display();
		remove("Tulsi");
		//System.out.println();
		display();
		Plant temp = search("Almond");
		System.out.println(temp.toString());
		temp = search("Tulsi");
		System.out.println(temp.toString());
	}
	
	public static void add(Plant p) {
		plantcount++;
		plants[plantcount] = p;
	}
	
	public static void remove(String delete) {
		int index = -1;
		for (int i = 0; i <= plantcount; i++) {
			if(plants[i].getName().equals(delete)) {
				index = i;
				break;
			}
		}
		
		for (int i = index; i < plantcount; i++) {
			plants[i] = plants[i+1];
		}plantcount--;
	}
	
	public static Plant search(String find) {
		int index = -1;
		for (int i = 0; i <= plantcount; i++) {
			if(plants[i].getName().equals(find)) {
				index = i;
				break;
			}
		}
		
		if(index == -1)
			return new Plant();
		
		return plants[index];
	}
	
	public static void display() {
		for (int i = 0; i <= plantcount; i++) {
			System.out.println(plants[i].toString());
		}
	}

}

class Plant{
	private String name = "N/A";
	private String color = "N/A";
	
	public Plant() {
		
	}
	
	public Plant(String n,String c) {
		this.name = n;
		this.color = c;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Plant [Name = "+name+", Color = "+color+"]";
	}
}

class Flower extends Plant{
	private boolean hasSmell;
	private boolean hasThorn;
	
	public Flower() {
		
	}
	
	public Flower(String n,String c,boolean smell,boolean thorn) {
		super(n,c);
		this.hasSmell = smell;
		this.hasThorn = thorn;
	}

	public boolean isHasSmell() {
		return hasSmell;
	}

	public boolean isHasThorn() {
		return hasThorn;
	}

	public void setHasSmell(boolean hasSmell) {
		this.hasSmell = hasSmell;
	}

	public void setHasThorn(boolean hasThorn) {
		this.hasThorn = hasThorn;
	}
	
	public String toString() {
		return "Flower [Name = "+getName()+", Color = "+getColor()+", hasSmell="+isHasSmell()+", hasThorn="+isHasThorn()+"]";
	}
}

class Herb extends Plant{
	private boolean isMedicinal;
	private String Season;
	
	public Herb() {
		
	}
	
	public Herb(String n,String c,String season,boolean medicinal) {
		super(n,c);
		this.Season = season;
		this.isMedicinal = medicinal;
	}

	public boolean isMedicinal() {
		return isMedicinal;
	}

	public String getSeason() {
		return Season;
	}

	public void setMedicinal(boolean isMedicinal) {
		this.isMedicinal = isMedicinal;
	}

	public void setSeason(String season) {
		Season = season;
	}
	
	public String toString() {
		return "Herb [Name = "+getName()+", Color = "+getColor()+", isMedicinal="+isMedicinal()+", Season="+getSeason()+"]";
	}
}