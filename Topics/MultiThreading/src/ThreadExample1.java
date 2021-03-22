public class ThreadExample1 {
	public static void main(String args[]){
	      Count cnt = new Count();
	      cnt.start();
	      try{
	         while(cnt.isAlive())
	         {
	           System.out.println("Main thread will be alive till the child thread is live");
	           Thread.sleep(1000);
	         }
	      }
	      catch(InterruptedException e){
	        System.out.println("Main thread interrupted");
	      }
	      System.out.println("Main thread's run is over" );
	   }
}
class Count extends Thread{
   public void run(){
     try{
        for (int i=0 ;i<10;i++)
        {
           System.out.println("Printing the count " + i);
           Thread.sleep(100);
        }
     }
     catch(InterruptedException e){
        System.out.println("my thread interrupted");
     }
     System.out.println("My thread run is over" );
   }
}