package br.com.ciss.thread;

public class TestaProgramaThreads {

	public static void main(String[] args) {
		ProgramaThreads p1 = new ProgramaThreads();
		p1.setId(1);
		
		Thread t1 = new Thread(p1);
		t1.start();
		
		ProgramaThreads p2 = new ProgramaThreads();
		p2.setId(2);
		
		Thread t2 = new Thread(p2);
		t2.start();
		
		
	}

}
