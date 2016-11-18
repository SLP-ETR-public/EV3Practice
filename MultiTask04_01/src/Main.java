public class Main {

    public static void main(String[] args) {
    	 Thread sensorThread = new Thread(new sensorThread());
         Thread runThread   = new Thread(new runThread());
         Thread timeThread = new Thread(new timeThread());

         sensorThread.start();
         runThread.start();
         timeThread.start();

        try {
        	sensorThread.join();
			runThread.join();
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
    }
}