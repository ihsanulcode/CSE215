
public class Position {

	public static void main(String[] args) {
		Move play = new Move();
		//play.CurrentLocation();
		
		play.east();
		play.east();
		play.east();
		play.north();
		play.north();
		
		play.west();
		play.west();
		play.west();
		play.west();
		play.west();
		
		play.south();
		play.south();
		play.south();
		//play.CurrentLocation();
		
		play.north();
		play.north();
		play.north();
		
		play.west();
		play.west();
		play.south();
		play.north();
		play.north();
		
		play.CurrentLocation();

	}

}

class Move{
	private int x;
	private int y;
	
	Move(){
		x = 0;
		y = 0;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void west() {
		x++;
	}
	
	public void east() {
		x--;
	}

	public void north() {
		y++;
	}
	
	public void south() {
		y--;
	}
	
	public void CurrentLocation() {
		System.out.println("Current position: ("+x+","+y+")");
	}
	
}
