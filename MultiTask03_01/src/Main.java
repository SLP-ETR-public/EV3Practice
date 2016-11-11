public class Main {

    public static void main(String[] args) {
        Thread soundThread = new Thread(new SoundClass());
        Thread runThread   = new Thread(new RunClass());

        soundThread.start();
        runThread.start();

        try {
			soundThread.join();
			runThread.join();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

    }
}
