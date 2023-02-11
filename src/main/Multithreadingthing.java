package main;

public class Multithreadingthing extends Thread {
	private int threadNumber;
	
	public Multithreadingthing(int threadNumber) {
		super();
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for(int i=0; i<=10; i++ ) {
			System.out.println(i+"this thread number: "+this.threadNumber);
			if(this.threadNumber==4) {
				throw new RuntimeException();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
