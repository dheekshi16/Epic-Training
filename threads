Threads 

class MyData extends Thread {
   public void run() {
       System.out.println("Thread is running");
   }
}
public class Main {
   public static void main(String[] args) {
       MyData t1 = new MyData();
       t1.start();
       System.out.println("In Main thread");
   }
}

Or (just the main class )

public class Main {
    public static void main(String[] args) {
        MyData t1 = new MyData();
        Thread th = new Thread(t1);
        th.start();
        System.out.println("In Main thread");
    }
}

—-----------------------------------------------------------------------------------------------------------------



class Counter{
	int count=0;
	public void incrementCount() {
		count++;
	}
}

class MyThread extends Thread{
	Counter count;//stores obj
	MyThread(Counter count){
		this.count = count;
	}
	public void run(){
    	for(int i=0;i<10;i++) {
    		System.out.println("sleeping");
    		try{
    		    Thread.sleep(1000);
    		}
    		catch(InterruptedException e){
    		    
    		}
    		count.incrementCount();
    	}
	}
}


public class CountingThread {

	public static void main(String[] args) throws InterruptedException{
		Counter count = new Counter();//#100
		MyThread t1 = new MyThread(count);//#100 -->10-->count=10
		MyThread t2 = new MyThread(count);//#100 -->10-->count=20
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	    System.out.println(count.count);
	}

}
