
public class Task {

	public static void main(String[] args) {
		Pet[] p = new Pet[6];

		p[0] = new Dog("Dog1", "Black");
		p[1] = new Dog("Dog2", "White");

		p[2] = new Cat("Cat1", "Black");
		p[3] = new Cat("Cat1", "White");

		p[4] = new Rabit("Rabit1", "Black");
		p[5] = new Rabit("Rabit1", "White");

		int rnum = (int) (Math.random() * (5 - 0 + 1) + 0);
		System.out.println(p[rnum].toString());
		System.out.println(p[rnum].Sound());

	}

}
