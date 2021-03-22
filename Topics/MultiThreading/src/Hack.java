public class Hack {
	
	public static void main(String args[]) {
		
		IhsanulPro pro = new IhsanulPro();
		pro.start();
		try {
			while (pro.isAlive()) {
				System.out.println("Hacking on process");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Hacking Interrupted");
		}
		System.out.println("Hacked!");
	}
}

class IhsanulPro extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i*10+"%");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Back End Hacking Interrupted");
		}
		System.out.println("Successfully Hacked back end");
	}
}