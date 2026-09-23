Counter Class

class Counter{
	int count=0;
	public void incrementCount() {
		count++;
	}
}

class MyThread extends Thread{
	Counter count;//obj
	MyThread(Counter count){
		this.count = count;
	}
	public void run(){
    	for(int i=0;i<10;i++) {
    		count.incrementCount();
    	}
	}
}


public class Main {

	public static void main(String[] args) {
		Counter c = new Counter();
		MyThread t1 = new MyThread(c); 
		MyThread t2 = new MyThread(c); 
		t1.start();
		t2.start();
	    System.out.println(c.count);
	}

}


class Counter{
	int count=0;
	public void incrementCount() {
		count++;
	}
}

class MyThread extends Thread{
	Counter count;//obj
	MyThread(Counter count){
		this.count = count;
	}
	public void run(){
    	for(int i=0;i<10;i++) {
    		try{
    		    Thread.sleep(1000);
    		}
    		catch(Exception e){
    		    
    		}
    		count.incrementCount();
    	}
	}
}
public class Main {

	public static void main(String[] args) {
		Counter c = new Counter();//#100
		MyThread t1 = new MyThread(c);//#100 -->10-->count=10
		MyThread t2 = new MyThread(c);//#100 -->10-->count=20
		t1.start();
		t2.start();
	    System.out.println(c.count);
	}

}

Or the main 
public class Main {

	public static void main(String[] args) {
		Counter c = new Counter();
		MyThread t1 = new MyThread(c); 
		MyThread t2 = new MyThread(c); 
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	    System.out.println(c.count);
	}

}
