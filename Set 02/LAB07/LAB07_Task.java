import java.util.Scanner;

public class LAB07_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//System.out.println();
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		Point start = new Point(x1,y1);
		Point end = new Point(x2,y2);
		
		Line line = new Line(start,end);
		System.out.printf("%.2f",line.length());
		
		input.close();
	}

}

class Point{
	private int x;
	private int y;
	
	Point(){
		
	}
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString(){
		return "X: "+x+"\nY: "+y;
	}
	
	public double distance(Point point) {
		return Math.sqrt(Math.pow((point.x-this.x), 2) + (Math.pow((point.y-this.y), 2)));
	}
}

class Line{
	private Point start;
	private Point end;
	
	Line(){
		
	}
	
	Line(int x1,int y1,int x2,int y2){
		this.start.setX(x1);
		this.start.setY(y1);
		this.end.setX(x2);
		this.end.setY(y2);
	}
	
	Line(Point start,Point end){
		this.start = start;
		this.end = end;
	}

	public Point getStart() {
		return start;
	}

	public Point getEnd() {
		return end;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	public double length() {
		return Math.sqrt(Math.pow((this.end.getX()-this.start.getX()), 2) + (Math.pow((this.end.getY()-this.start.getY()), 2)));
	}
}
