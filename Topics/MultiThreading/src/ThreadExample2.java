public class ThreadExample2 {
	   public static void main(String args[]) {      
		      Thread t1 = new Thread (new RunnableDemo( "First  Thread"));
		      t1.start();
		      
		      Thread t2 = new Thread (new RunnableDemo( "Second Thread"));
		      t2.start();
		   } 
}
class RunnableDemo implements Runnable {
	   private String threadName;	   
	   RunnableDemo( String name){
	       threadName = name;
	       System.out.println("Creating " +  threadName );
	   }
	   public void run() {
	      System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(100);
	         }
	     } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	     }
	     System.out.println("Thread " +  threadName + " exiting.");
	   }
	}