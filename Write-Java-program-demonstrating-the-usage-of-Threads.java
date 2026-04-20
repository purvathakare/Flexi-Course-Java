package q11349;

public class ThreadDemo {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new Printer("Good morning", 1, 2));
		Thread t2 = new Thread(new Printer("Hello", 1, 2));
		Thread t3 = new Thread(new Printer("Welcome", 3, 1));
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("All the three threads t1, t2 and t3 have completed execution.");
    }
}

class Printer implements Runnable {
	private String message;
	private int delay;
	private int count;

	public Printer(String message, int delay, int count){
		this.message = message;
		this.delay = delay;
		this.count = count;
	}
	@Override
	public void run(){
		for(int i = 0; i < count; i++){
			System.out.println(message);
			try{
				Thread.sleep(delay * 1000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
