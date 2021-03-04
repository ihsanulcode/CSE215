
public class Task2 {

	public static void main(String[] args) {
		Sports s1 = new Sports();
		
		System.out.println(s1.getName());
		s1.getNumberOfTeamMembers();
		
		Soccer s2 = new Soccer(11);
		System.out.println(s2.getName());
		s2.getNumberOfTeamMembers();

	}

}

class Sports {
	String getName() {
		return "Generic Sports";
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports {
	private int TeamMembers;
	
	Soccer(){
		
	}
	
	public Soccer(int TeamMembers){
		this.TeamMembers = TeamMembers;
	}

	@Override
	String getName() {
		return "Soccer Class";
	}
	
	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has "+TeamMembers+" players in " + getName());
	}
}
