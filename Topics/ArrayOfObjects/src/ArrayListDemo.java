import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Plant> p = new ArrayList<Plant>();

		//adding
		p.add(0, new Flower("Rose", "Red", true, true));
		p.add(1, new Herb("Oregano", "Toad green", true, "Summer"));
		
		//add method
		add(p,new Flower("Orchids", "Purple", true, false));
		
		//search
		search(p,"Oregano");
		
		//remove
		remove(p,"Rose");
		//display
		display(p);
	}

	static void add(ArrayList<Plant> plants,Plant p) {
		plants.add(p);
	}
	
	static void search(ArrayList<Plant> plants,String n) {
		boolean flag = false;
		int index = -1;
		
		System.out.println("Search Result:\n");
		for (int i = 0; i < plants.size(); i++) {
			if(n.equals(plants.get(i).getName())) {
				flag = true;
				index = i;
			}
		}
		if(flag) {
			System.out.println(plants.get(index));
		}else {
			System.out.println("Can't found!");
		}
	}
	
	static void remove(ArrayList<Plant> plants,String n) {
		for (int i = 0; i < plants.size(); i++) {
			if(n.equals(plants.get(i).getName())) {
				plants.remove(i);
			}
		}
	}
	static void display(ArrayList<Plant> plants) {
		System.out.println("\n----- Display -----");
		System.out.println();
		
		for (Plant i : plants) {
			System.out.println(i);
			System.out.println();
		}
	}

}

class Plant {
	private String name;
	private String color;

	Plant() {

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
		return null;
	}
}

class Flower extends Plant {
	private boolean hasSmell;
	private boolean hasThorn;

	Flower() {

	}

	Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
		setName(name);
		setColor(color);
		this.hasSmell = hasSmell;
		this.hasThorn = hasThorn;
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
		return "Flower Name: " + getName() + "\nColor: " + getColor() + "\nSmell: " + isHasSmell() + "\nThorn: "
				+ isHasThorn();
	}
}

class Herb extends Plant {
	private boolean isMedicinal;
	private String season;

	Herb() {

	}

	Herb(String name, String color, boolean isMedicinal, String season) {
		setName(name);
		setColor(color);
		this.isMedicinal = isMedicinal;
		this.season = season;
	}

	public boolean isMedicinal() {
		return isMedicinal;
	}

	public String getSeason() {
		return season;
	}

	public void setMedicinal(boolean isMedicinal) {
		this.isMedicinal = isMedicinal;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String toString() {
		return "Herb Name: " + getName() + "\nColor: " + getColor() + "\nMedicinal: " + isMedicinal() + "\nSeason: "
				+ getSeason();
	}
}
